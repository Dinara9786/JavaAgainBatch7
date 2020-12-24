package com.review.class24;

public class Parent {
	
	private void hello () { // private methods do not participate in inheritance = > cannot override. 
		System.out.println("Hello from parent class");
	}
	
	protected static void hi() {
		System.out.println("Hello");
	}

}

class Child extends Parent {
	
	// we do not override private methods. we can create own private method inside each/child class
	private void hello () {
		System.out.println("Hello from Child class");
	}
	
	public static void hi () { // CE: we cannot override static methods
		System.out.println("Hello");
	}
}

