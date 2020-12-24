package com.review.class21;

public class USA {
	
	public static String country;
	String state;
	String capital;
	
	USA (String state, String capital) {
		this.state = state;
		this.capital = capital;
				
	}
	
	void displayState() {
		System.out.println("state is = " + state);
	}
	
	void displayCapital() {
		System.out.println("capital is = " + capital);
	}
	
	void displayInfo() { // we can method from another method
		displayState(); // this.displayState(); Compiler adds this to refer to instance variable
		displayCapital(); //this.displayCapital(); Compiler adds this to refer to instance variable
	}

}	
