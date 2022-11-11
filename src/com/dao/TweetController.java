package com.dao;

import com.model.*;

import java.util.Scanner;

import com.dao.*;
import com.jdbc.*;

public class TweetController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO TWEET APP.");
		while (true) {
			System.out.println("Enter the below options\n 1.login\n 2.new register\n 3.forget password \n 4.Exit App");
			boolean result = false;

			int option = Integer.parseInt(sc.nextLine());

			if (option == 1) {
				System.out.println("Enter username :");
				String username = sc.nextLine();

				System.out.println("Enter password");
				String password = sc.nextLine();

				LoginClass login = new LoginClass();
				boolean loginStatus = login.loginUser(username, password);
				
				if (loginStatus) {
					System.out.println("WELCOME " + username);

					while (true) {
						System.out.println(
								"Choose the options: \n 1.post tweet \n 2.veiw my tweet \n 3.veiw all tweets \n 4.veiw all users \n 5.reset password \n 6.log out");

						int loginOptions = Integer.parseInt(sc.nextLine());

						if (loginOptions == 1) {

							System.out.println("Enter the tweet : ");
							String tweet = sc.nextLine();

							boolean tweetStatus = login.postTweet(tweet, username);
							if (tweetStatus)
								System.out.println("Posted Tweet");
							else
								System.out.println("OOPS !, Try again to post tweet");
						}

						else if (loginOptions == 3) {
							boolean veiwStatus = login.veiwAllTweet();
							if (veiwStatus)
								System.out.println("All tweets are shown");
							else
								System.out.println("Error Occured,Try Again");
						}

						else if (loginOptions == 2) {

							boolean veiwUserTweet = login.veiwTweetByUserName(username);
							if (veiwUserTweet)
								System.out.println("Tweets of " + username + " is shown");
							else
								System.out.println("Error Occured . Cannot display the details for " + username);
						}

						else if (loginOptions == 6) {
							boolean logOutStatus = login.logout(username);
							if (logOutStatus)
							{
								System.out.println("Log Out completed ");
								break;
							}
							else
								System.out.println("Log Out Not Completed");
						}
						
						
						else if(loginOptions==5)
						{
							System.out.println("Enter password");
							String resetPassword = sc.nextLine();

							
							result = login.forgetpassword(resetPassword, username);
							if (result) {
								System.out.println("Password Reset Completed");
							} else
								System.out.println("ERROR ! , Password Reset Not Completed .");

						}else if(loginOptions==4)
						{
							
							result = login.veiwAllUsers();
							if (result) {
								System.out.println("All Users Are Dispalyed");
							} else
								System.out.println("ERROR ! , Users Cannot Be Dispalyed .");
						}
					}
				} else
					System.out.println("OOPS !, Try again to login");

			}
// __________________________________________________________________________________________________________________________

			else if (option == 2) {
				System.out.println("Enter username :");
				String username = sc.nextLine();

				System.out.println("Enter Email :");
				String email = sc.nextLine();

				System.out.println("Enter password :");
				String password = sc.nextLine();

				RegisterClass register = new RegisterClass();
				result = register.registerUser(username, email, password);
				if (result) {
					System.out.println("Registration Completed .");
				} else
					System.out.println("Existing Account or Registration Not Done. Try again");

			} 
			
// __________________________________________________________________________________________________________________________
	
			
			else if (option == 3) {
				System.out.println("Enter username :");
				String username = sc.nextLine();

				System.out.println("Enter password");
				String password = sc.nextLine();

				LoginClass login = new LoginClass();

				result = login.forgetpassword(password, username);
				if (result) {
					System.out.println("Password reset successful");
				} else
					System.out.println("ERROR ! , Password not reset");

			}
			
// __________________________________________________________________________________________________________________________

			else if(option==4)
			{
				System.out.println("Thank You for visiting !");
				break;
			}
		
		}

	}

}
