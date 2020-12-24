package com.review.class08;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// SYstem.in means reading from Console
		int start;
		int end;
		int sumOdd = 0;
		int sumEven = 0;
		int total;
		System.out.println("Please enter a starting number");

		start = scan.nextInt();

		System.out.println("Please enter a starting number");
		end = scan.nextInt();

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			}

			if (i % 2 == 1) {
				sumOdd += i;
			}

		}

		System.out.println("Sum of odd numbers is =" + sumOdd);
		System.out.println("Sum of even numbers is =" + sumEven);
		System.out.println(total = sumOdd + sumEven);
	}
}
