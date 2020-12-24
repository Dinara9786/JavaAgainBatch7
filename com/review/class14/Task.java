package com.review.class14;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Scanner is a class

		System.out.println("Please enter Username");

		String username = scan.nextLine();

		System.out.println("Please enter Password");

		String password = scan.nextLine();

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or Password should not be empty");
		} else {
			if (password.length() > 8) {
				if (!password.contains(username)) {
					System.out.println("Please confirm your password");
					String confirmedPassword = scan.nextLine();
					if(password.equals(confirmedPassword)) {
					System.out.println("Your username and password have been created"); 
					}else { 
						System.out.println("Passwords do not match ");
					}
				} else {
					System.out.println("Your password should not contain username");
				}
			} else {
				System.out.println("Password is too short");
			}

		}

	}
}
