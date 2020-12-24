package com.review.class09;

public class Patterns {
public static void main(String[] args) {
	
	// I want to print this pattern
	//*****
	//*****
	//*****
	//*****
	
	for (int i=1; i<=4; i++) {
		for (int j=1; j<6; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for (int a=1; a<=10; a++) {
		for (int b=1; b<=10; b++) {
			System.out.print("$" + " ");
		}
		System.out.println();
	}
	
	for (int row = 1; row <4; row++) {
		for (int col = 1; col<6; col++) {
			System.out.print(col);
		}
		
		System.out.println();
	}
	
	for (int k=1; k<5; k++) {
		for (int l=1; l<=5; l++) {
				System.out.print(k);
	}
	System.out.println();
}
}
}
