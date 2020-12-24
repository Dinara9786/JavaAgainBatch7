package com.review.class07;

public class Task {
	
	// how to print from 50 to 1
		// how to print odds numbers from 1 to 20
	public static void main(String[] args) {
	
	
	int i = 50;
	while (i>0) {
		System.out.print(i + " ");
		i--;
	}
	System.out.println();
	
//	int x = 1;
//	while (x<20) {
//		System.out.print(x + " ");
//		x+=2;
	
	int k = 1;
	while (k<20) {
		if (k%2==1) {
		System.out.print(k + " ");
	}
		k++;
	}
	
	System.out.println();
	int z = 0; 
	while (z<20) {
		z++;
		System.out.print(z + " ");
		z++;
	}
}
}
