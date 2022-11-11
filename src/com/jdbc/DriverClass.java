package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DriverClass {

	public static Connection getConnection() throws Exception {
		Connection con=null;
	
			
		 try {
			// Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tweet_app", "root", "pass@word1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
System.out.println("DATABASE CONNECTION ESTABLISHED");
		return con;
	}

	
}
