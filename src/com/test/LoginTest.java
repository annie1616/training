package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.dao.LoginClass;
import com.dao.TweetController;
import com.jdbc.DriverClass;
import com.model.Login;

class LoginTest {

	private static TweetController tdao;
private static Connection connection=null;
	@BeforeEach
	@Test
	static void init()
	{
		try {
			Connection connection=DriverClass.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	static void loginUserTest() {
		try {
			connection=DriverClass.getConnection();
			LoginClass login=new LoginClass();
			boolean status=login.loginUser("name1", "pwnew1");
			String user="name1";
			if(status) {
				Statement st = connection.createStatement();
				ResultSet resultSet = st.executeQuery("select username from login_table");
				
				while(resultSet.next()){
					assertEquals(user,resultSet.getString("username"),"User present");
				}
				

				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
