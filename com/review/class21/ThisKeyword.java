package com.review.class21;

public class ThisKeyword {
	
	int a, b; // instance variable , default modifier 
	
	ThisKeyword() {
		System.out.println("I am a constructor that you do not really need");
	}
	
	ThisKeyword(int a, int b) { // local variable
		this.a = a;
		this.b = b;
	}
	
	void sum(int a, int b) {
		// sum of local variables
		System.out.println(a+b);
		//how to get sum of instance variables?
		
		// if we want to calculate the sum of instance variables 
		// we need to use this.keyword
		
		System.out.println(this.a + this.b);// we got sum of instance variables
	
	
	}
}
