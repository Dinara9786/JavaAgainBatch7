package com.review.class08;

public class SkipNumbers {
	public static void main(String[] args) {
		
		// I want to print from 1 to 10 and skip 5, 6, 7
		
		for (int i=1; i<=10; i++) {
			if (i==5 || i==6 || i==7) {
				continue;
			}
			System.out.println(i);
		}
		
		// We watn to print number from 1 to 100 and want to skip numbers from 35 to 55
		
		for (int j=0; j<=100; j++) {
			if (j>=35 && j<=55 ) {
				continue;
			}
			System.out.println(j);
		}
		
	}

}
