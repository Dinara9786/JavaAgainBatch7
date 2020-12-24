package com.review.class04;

import java.util.Scanner;

public class Loan {
	public static void main(String[] args) {
		
		Scanner loan = new Scanner (System.in);
		
//		System.out.println("Please enter the amount of the loan you would like to take");
//				
//		int amount = loan.nextInt();
//		if (amount <=200) {
//			System.out.println("You will get a loan");
//		} else if (amount >= 200 && amount <= 250){
//			System.out.println("Your request will be fowarded for review");
//		}else {
//			System.out.println("The loan is not approved");
//		}
//		
//		System.out.println("Please enter your age in number");
//		int age = loan.nextInt();
//		if (age >18) {
//			System.out.println("You will be issued driving license");
//		} else { 
//			System.out.println("You will be issued learning permit");
//		}
		
//		System.out.println("Please advise if your have a credit card. Yes or NO?");
//		
//		boolean card = loan.nextBoolean();
//		//String yes = "Yes";
//		
//		
//		if (card) {
//			System.out.println("It is good");
//		} else {
//			System.out.println("Do you have a balance on your card. Please state in numbers");
//			int balance = loan.nextInt();
//			if (balance >1000) {
//			System.out.println("Please pay off immediately");
//		} else {
//			System.out.println("You can spend more");
//		}
		
//			System.out.println("Please enter number of experience");
//			int experience = loan.nextInt();
//			if (experience>=5) {
//				System.out.println("You are eligible for bonus");
//				
//				System.out.println("Please enter your salary");
//				int salary = loan.nextInt();
//				if (salary >5000) {
//					System.out.println("Your bonus is 5000");
//				}else {
//					System.out.println("Your bonus is 3000");
//				}
//			} else {
//				System.out.println("You are not eligible for bonus");
//			}
		
		System.out.println("Please state the city you live in");
		
		String city = loan.nextLine();
		
		System.out.println("Please state current temperature in farenheit");
		
		int temperature = loan.nextInt();
		System.out.println("Your city is " +  city + " and your temperature in Celcius is " + temperature/3);
		
		
			
	}
	}

