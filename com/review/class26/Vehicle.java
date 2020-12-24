package com.review.class26;

public abstract class Vehicle {

	public String vin; // instance variable
	public static int totalVehicles;

	public Vehicle(String vin) {// Costructor cannot be static// we can initialize oly instance variables
		this.vin = vin;
		totalVehicles++;
	}

	public static int getTotal() {
		return totalVehicles;
	}

	public void drive() {
		System.out.println("All vehicle drives");
	}

	public void stop() {
		System.out.println("All vehicles stop by pressing break");
	}

	public abstract void start();

	public abstract void openTrunk();
}

abstract class Car extends Vehicle {

	public Car(String vin) {
		super(vin);

	}

	public void openTrunk() {
		System.out.println("All cars can open trunks manually");
	}
}

class Lamborgini extends Car {
	Lamborgini(String vin) {
		super(vin);

	}

	public void start() {
		System.out.println("Lamborgini starts magically");
	}

}