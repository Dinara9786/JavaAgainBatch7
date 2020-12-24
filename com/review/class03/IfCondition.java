package com.review.class03;

public class IfCondition {
	
	public static void main(String[] args) {
	
		//declare a number a compare if the number is larger than 100.
		//It it is larger than 100, I will print -- > My nubmer is large
		
		int num = 38;
		boolean result = num>100;
		
		System.out.println("Let us check");
		
		if (num>100) {
			System.out.println("My number is larger");
		} else {
			
			System.out.println("My number is small");
		}
		
		System.out.println("The check is complete");
		
		boolean result1 = num>100;
		if (result1) {
			System.out.println("The result is true");
		}
		
		System.out.println("====================================");
		
		int expectedHours = 15;
		int actualHours = 15;
		
		if (actualHours>=expectedHours) {
			System.out.println("You will love Java");
		}else {
			System.out.println("You may not get Java");
		}
		
		System.out.println("===============================");
		
		double budget = 15000;
		double carPrice = 15000;
		
		if (budget>=carPrice) {
			System.out.println("I will buy this car");
			System.out.println("I am happy");
		} else {//otherwise
			System.out.println("I will not buy this car");
			System.out.println("I will study Java");
			System.out.println("I will get a job and earn money");
		}
		
	}

}
