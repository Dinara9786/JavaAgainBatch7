package com.review.class07;

import java.util.Scanner;

// ask teh user the name 5 times adn print God Afternoon 5 times

public class ScannerAndLoop {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your name");
		
		String name = scan.nextLine();
		System.out.println("Good Afternoon " + name);
		
		int num = 1; 
		
		while (num<5) {
			System.out.println("Good Afternoon " + name);
			num++;
	}
		int num1 = 1; 
		do {
			System.out.println("Please enter your name one more time");
			String name2 = scan.nextLine();
		
			System.out.println("Good afternoon " + name2);
			num1++;
		}while (num<=5);

}
}
