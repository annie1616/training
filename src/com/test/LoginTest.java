package com.test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;

import com.dao.LoginClass;
import com.dao.TweetController;
import com.jdbc.DriverClass;
import com.model.Login;

class LoginTest {

	private static TweetController tdao;
	private static Connection connection = null;

	@Before
	@Test
	static void init() {
		try {
			Connection connection = DriverClass.getConnection();
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
				assertEquals(true,status);
				
				

				
			
		}catch(	Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

	
	@Test
	static void postTweetTest() {
		try {
			connection=DriverClass.getConnection();
			LoginClass login=new LoginClass();
			boolean status=login.postTweet("hi test", "name1");
				assertEquals(true,status);
	
				

				
			
		}catch(	Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
	@Test
	static void veiwTweetByUsernameTest() {
		try {
			connection=DriverClass.getConnection();
			LoginClass login=new LoginClass();
			boolean status=login.veiwTweetByUserName("name1");
				assertEquals(true,status);
				
				

				
			
		}catch(	Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		@Test
		static void veiwAllTweetTest() {
			try {
				connection=DriverClass.getConnection();
				LoginClass login=new LoginClass();
				boolean status=login.veiwAllTweet();
					assertEquals(true,status);
					
					

					
				
			}catch(	Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
		@Test
		static void logOutTest() {
			try {
				connection=DriverClass.getConnection();
				LoginClass login=new LoginClass();
				boolean status=login.logout("name");
					assertEquals(true,status);
					
					

					
				
			}catch(	Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		@Test
		static void forgetPasswordTest() {
			try {
				connection=DriverClass.getConnection();
				LoginClass login=new LoginClass();
				boolean status=login.forgetpassword("name1", "pwnew1");
					assertEquals(true,status);
					
					

					
				
			}catch(	Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}



