package com.review.class08;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		
		for (int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
			for (int j=1; j<=10; j++) {
			System.out.println("Please apply for a credit card");
			String answer = scan.next();
			if (answer.contentEquals("yes")) {
				System.out.println("Congratulations! Credit card is approved");
				break;
			}
		}
	}

}
