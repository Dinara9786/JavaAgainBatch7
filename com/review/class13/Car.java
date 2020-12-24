package com.review.class13;

public class Car {
	
	
	//define car features using variables
	
	String make; 
	String model;
	String color; 
	int year;
	int speed;
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		Car c1 = new Car();
		c1.make = "Honda";
		c1.color = "Yellow";
		c1.year = 2018;
		c1.speed =234;
		
		// calling method driver
		c1.drive();
		
		// calling method stop
		c1.stop();
		
		//calling method transportPeople
		c1.reverse();
		
	}
	// define behavior in a for of methods
	
	void drive() {
		System.out.println(make + " of the year " + year + " can drive");
	}
	
	void reverse() {
		System.out.println(make + "  can reverse");
	}
	
	void transportPeople () {
		System.out.println(make + " transports people");
	}
	
	void stop() {
		System.out.println("Car can stop");
	}

}
