package com.review.class04;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		int a = 65;
		String s = "bla";
		
		Scanner scan = new Scanner (System.in); // System.in means = reads from COnsole
		
		System.out.println("Please write some text and press enter");
		
		String text = scan.nextLine(); //  scan.nextLIne means reading one line from console
										// text = storing a line in variable
		
		System.out.println("===========================");
		System.out.println(text);
		
		// let me read an integer
		System.out.println("Please enter your age. It should be a number");
		int num = scan.nextInt(); // If not an integer, run time error
		System.out.println("The age that you entered is " + 65);
		
		
	}

}
