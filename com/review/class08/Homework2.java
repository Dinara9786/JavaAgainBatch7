package com.review.class08;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		String item;
		double price;
		double payment;
		double change;
		double totalAmount=0;
		double remainingBalance;
		
		//double addCash = price - payment;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the item you want to buy");
		item = scan.nextLine();

		System.out.println("Please enter the price");
		price = scan.nextDouble();

		do {
			System.out.println("Please pay the bill");
			payment=scan.nextDouble();
			totalAmount +=payment;
			if (totalAmount<price) {
				remainingBalance = price-totalAmount;
				
				System.out.println("You should pay more " + remainingBalance);
			} else if (totalAmount >price ) {
				change = totalAmount-price;
				System.out.println("Here is your change " + change);
			} else {
				System.out.println("You paid your invoice");
			}
		
		}while (totalAmount<price) ;
		System.out.println("Thank you for shopping");
	}
	
	}


