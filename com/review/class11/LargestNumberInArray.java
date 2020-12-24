package com.review.class11;

public class LargestNumberInArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 6, 10, 112, 12, 56, 100 };

		System.out.println("Retrieving largest using regular for Loop");
		System.out.println();
		
		int largest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];

			}
		}
		System.out.println(largest);
		
		System.out.println("Retrieving largest using Enhanced / For Each Loop");
		System.out.println();

		int largest1 = numbers[0];
		for (int number : numbers) {
			if (number > largest1) {
				largest1 = number; // re=assigning largest to number
			}

		}
		System.out.println(largest1);
		
		//int[] numbers = { 2, 6, 10, 112, 1, 12, 56, 100, 0 };
		
		System.out.println("Retrieving MINIMUM using Enhanced / For Each Loop");
		System.out.println();
		
		int minimum = numbers[0];
		for (int number : numbers) {
			if (number < minimum) {
				minimum = number; // re=assigning largest to number
			}

		}
		System.out.println(minimum);
	}
}
