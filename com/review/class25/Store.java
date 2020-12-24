package com.review.class25;

public class Store {

	String name, location;

	Store(String name, String location) {// we need constructor to create to initialize variables
		this.name = name;
		this.location = location;
	}

	public void openHours() {
		System.out.println("Stores are open from 8 AM to 8PM");
	}

	public void sell() {
		System.out.println("Stores sale items");
	}
}

class Macys extends Store {
	Macys(String name, String location) {
		super(name, location);
	}

	@Override
	public void openHours() {
		System.out.println(name + " is open from 8 AM to 12 PM in " + location);

	}
}

class Starbucks extends Store {
	Starbucks (String name, String location) {
		super(name, location);
	}
	
	@Override
	public void openHours() {
		System.out.println(name + " is open everyday from 6 AM till 8 PM in " +  location);
	}
	
	public void sellCoffee() {
		System.out.println(name + " sells drinks");
	}
	
}
class Nike extends Store {
	
	String shoes;
	Nike (String name, String location, String shoes) {
		super(name, location);
		this.shoes=shoes;
	}
	
	public void openHours() {
		System.out.println(name + " is open from 9 AM to 12 PM in " + location);
}
}
