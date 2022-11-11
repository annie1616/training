package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.dao.*;
import com.jdbc.*;
import com.model.*;

public class LoginClass {

	static Connection connection = null;

	public static boolean isLogin(String username, String password) {
		boolean registerStatus = false;
		try {

			System.out.println("Checking for registration");
			connection = DriverClass.getConnection();
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("select r_username,r_password from register  ");

			while (resultSet.next()) {
				if (username.equals(resultSet.getString("r_username"))
						&& password.equals(resultSet.getString("r_password"))) {
					registerStatus = true;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return registerStatus;

	}
//____________________________________________________________________________________________________________________________

	public boolean loginUser(String username, String password) {
		boolean loginStatus = false;
		try {
			connection = DriverClass.getConnection();
			

			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("select r_username,register_status from register  ");
			boolean status=false;
			while (resultSet.next()) {
				if(username.equals(resultSet.getString("r_username")))
				{
				status=resultSet.getBoolean("register_status");
				}
			}


			if (LoginClass.isLogin(username, password) && status) {
				
				PreparedStatement ps = connection
						.prepareStatement("insert into login_table(username,password,status) values (?,?,?)");
				ps.setString(1, username);
				ps.setString(2, password);
				ps.setBoolean(3, true);

				ps.executeUpdate();
//			ps.setBoolean(4, true);

				Statement st1 = connection.createStatement();
				ResultSet resultSet1 = st1.executeQuery("select * from login_table  ");

				

				loginStatus = true;
				System.out.println("Login Success");
			} else
				System.out.println("Invalid Login.Please Register.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginStatus;

	}

//____________________________________________________________________________________________________________________________

	public static boolean postTweet(String tweet, String username) {
		boolean tstatus = false;

		try {
			connection = DriverClass.getConnection();
			PreparedStatement ps = connection
					.prepareStatement("insert into tweet_app.tweet_table(tweet_username,tweet_sentence) values (?,?);");
			ps.setString(1, username);
			ps.setString(2, tweet);
			ps.executeUpdate();
			tstatus = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return tstatus;
	}

//____________________________________________________________________________________________________________________________

	public static boolean veiwAllTweet() {
		boolean tstatus = false;

		try {
			connection = DriverClass.getConnection();

			String query = "select * from tweet_table";

			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery(query);

			while (resultSet.next()) {
				String user = resultSet.getString("tweet_username");
				String tweetsentence = resultSet.getString("tweet_sentence");

				System.out.println("user name : " + user);
				System.out.println("Tweet : " + tweetsentence);
			}

			tstatus = true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tstatus;
	}

	
	
//____________________________________________________________________________________________________________________________

	public static boolean veiwTweetByUserName(String username) {
		boolean tstatus = false;

		try {
			connection = DriverClass.getConnection();

			String query = "select * from tweet_table ";

			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery(query);

			while (resultSet.next()) {
				String user = resultSet.getString("tweet_username");
				String tweetsentence = resultSet.getString("tweet_sentence");

//				System.out.println("user name : " + user);
				if (username.equals(user))
					System.out.println("Tweet : " + tweetsentence);
			}

			tstatus = true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tstatus;
	}
	// __________________________________________________________________________________________________________________________
	
	public static boolean veiwAllUsers() {
		boolean tstatus = false;

		try {
			connection = DriverClass.getConnection();

			String query = "select r_username from register";

			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery(query);
int i=1;
			while (resultSet.next()) {
				String user = resultSet.getString("r_username");
				

				System.out.println("user name : " + i + " " + user);
				i++;
			}
i=0;
			tstatus = true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tstatus;
	}


	public boolean logout(String username) {
		boolean status = false;
		try {
			connection = DriverClass.getConnection();

			String query = "select status from login_table ";
			PreparedStatement ps = connection.prepareStatement("update login_table set status=0 where username=? ");
			ps.setString(1, username);
		
			status = true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

//____________________________________________________________________________________________________________________________

	public boolean forgetpassword(String password, String userName) {
		boolean status = false;
		try {
			connection = DriverClass.getConnection();
			PreparedStatement ps = connection.prepareStatement("update login_table set password=? where username=? ");
			ps.setString(1, password);
			ps.setString(2, userName);

			ps.executeUpdate();
			
			
			PreparedStatement ps1 = connection.prepareStatement("update register set r_password=? where r_username=? ");
			ps1.setString(1, password);
			ps1.setString(2, userName);
			
			ps1.executeUpdate();

			
			
			status = true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
