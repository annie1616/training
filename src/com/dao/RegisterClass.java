package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.DriverClass;

public class RegisterClass {
	

	
	
	public static boolean registerUser(String username,String email,String password) {
		
		boolean registerStatus=false;
		
		try {
			Connection connection = DriverClass.getConnection();
			
			try {

				PreparedStatement ps= connection.prepareStatement("insert into register(r_username,r_email,r_password) values(?,?,?);");
				
				ps.setString(1, username);
				ps.setString(2,email);
				ps.setString(3,password);
				ps.executeUpdate();
				
				PreparedStatement ps1= connection.prepareStatement("update login set register_status=? where username=? ");
				ps1.setBoolean(1, true);
				ps1.setString(2,username);
				ps1.executeUpdate();
				registerStatus=true;
				
			}catch(Exception e)
			{
				System.out.println("registered user . Please try login");
			}
			

//			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		return registerStatus;
		
	}

}
