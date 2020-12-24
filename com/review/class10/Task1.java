package com.review.class10;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many floors do you have in this hotel");
		int floor = scan.nextInt();
		
		System.out.println("How many rooms do you have in this hotel");
		int room = scan.nextInt();
		
		for (int i = 1; i <= floor; i++) {
			System.out.print("We are on the " + i + " floor ---> ");
			
		for (int j = 1; j <= room; j++) {
			System.out.print(i + "." + j + " ");
		}
		System.out.println();
		}
		
	}
	}

