package com.review.class14;

import java.util.Scanner;

public class TaskUsernamePassword {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Scanner is a class

		System.out.println("Please enter Username");

		String username = scan.nextLine();

		System.out.println("Please enter Password");

		String password = scan.nextLine();

		if (!username.isEmpty()) {
			System.out.println("Your username has been created"); 
		} else {
			System.out.println("Username should not be empty");
		}
			if (password.length() > 8) {
				System.out.println("Your password is good ");
			}else {
				System.out.println("YOur password is short. It should contain more than 8 characters");
			}
				if (!password.contains(username)) {
					System.out.println("Your password does not contain username"); 
					}else {
						System.out.println("Your password should not contain username");
					}
					String expectedPassword = "Vezunchik9786";
					String actualPassword = password;
					if (expectedPassword.equals(actualPassword)) {
						System.out.println("Your username and password have been created");
					}

				}
	}
			
		

	


