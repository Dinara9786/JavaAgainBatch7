package com.review.class10;

public class ArrayAnotherWay {
	
	public static void main(String[] args) {
		
		// we created an array adn stored the initial values 
		String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		// Let us print the element with index 3
		System.out.println(weekdays[3]);
		
		double [] bal = {1000, 23.50, 40.44};
		System.out.println("Total balance is " + (bal[0] + bal[1] + bal[2]));
		int total = (int) (bal[0] + bal[1] + bal[2]);
		System.out.println(total);
		
		// never create array with 0 elements, 
		// because you cannot add elements later
		// array should not be negative
		
		//int [] numbers = new int[]; // this is invalid
		
		
		
	}
	

}
