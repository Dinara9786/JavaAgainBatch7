package com.review.class04;

import java.util.Scanner;

public class ScannerExample {
	// Ask a user for a name and print name.
	// Ask the user to enter the age and print name and age
	
	public static void main(String[] args) {
		
		// We bring the Scanner class to our program
		// System.in --> reads from keyboard/console
		Scanner input = new Scanner (System.in);
		
		// We are instructing the user what to enter
		System.out.println("Please enter your name");
		String name = input.nextLine();
		//We are capturing the whole line into a text variable
		System.out.println("Your name is " + name);
		
		
		//We are instructing the user what to enter
		System.out.println("Please enter your age in numbers");
		int age = input.nextInt();
		System.out.println("Your name is " + name + " and your age is " + age);
		
		System.out.println("Please enter your exact age in numbers ie 25.3");
		//We are capturing the text as a double
		//If it is a not a double , then an error/exception wilb e printed
		double age1 = input.nextDouble();
		System.out.println("Your name is " + name + " and your full age is " + age1);
		
	}
	

}
