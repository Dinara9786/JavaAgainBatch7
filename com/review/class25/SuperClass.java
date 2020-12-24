package com.review.class25;

public class SuperClass {
	
	protected static void enjoy () {
		System.out.println("I enjoy Sundays");
		
	}
	
}

class SubClass extends SuperClass{
	
	public static void enjoy () { // static cannot be overrided, but we can have 2 static methods
		System.out.println("Enjoy every day");
	}

}
