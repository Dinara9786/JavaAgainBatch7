package com.review.class23;

public class SuperClass {

	String name = "Kamila";

	public void printHello() {
		System.out.println("Hello from Parent class");
	}
}

class SubClass extends SuperClass {

	String name = "Mina";

	public void displayName() {

		System.out.println(this.name);
		System.out.println(super.name); // name of parent class
		// super = has access to variable to parent class
		// if variable is the same in Parent and Child then we specify super.name
	}

	public void printHello() {
		System.out.println("Hello from child class");

	}

	public void callingParentMethod() {
		printHello(); // by default the compiler adds this.printhello
		super.printHello();

	}
}
