package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.dao.LoginClass;
import com.dao.RegisterClass;
import com.jdbc.DriverClass;

class RegistrationTest {
	private static Connection connection=null;
	@BeforeAll
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
	static void registerUserTest() {
		try {
			connection=DriverClass.getConnection();
			RegisterClass register=new RegisterClass();
			boolean status=register.registerUser("name5", "email5", "pw5");
			//String user="name1";
			assertEquals(true,status,"login succesful");
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
