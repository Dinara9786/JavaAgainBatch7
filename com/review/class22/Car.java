package com.review.class22;

public class Car {
	
	String make;
	
	public Car (String make) {// by default Parent of Car class is Object
		// super(); calls the constructor of object class
	this.make = make;
	}

}

class Tesla extends Car {
	
	boolean autopilot;
	
	public Tesla(String make, boolean autopilot) {
		//super(); by default we call parent class
		super(make);
		this.autopilot = autopilot;
		
	}
	
	void info() {
		System.out.println("We build " + make + " that has autopilot feature =" + autopilot);
	}
	
}
