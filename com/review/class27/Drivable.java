package com.review.class27;

public interface Drivable {// INTERFACE is collection of public abstract methods adn public static final variables. INTERFACE is blueprint
	
	
	//public static final variables are CONSTANT VARIABLES, they cannot be changed, once we declare they are final and static and variables should be initialized
	
	String DRIVE = "Drive safe";// by default the compiler will add PUBLIC STATIC FINAL  to variables
	
	//int maxSpeed; cannot have instance variables because compiler add public static final
	
	void driving();//  by default it will add public abstract , because we know inside INTERFACE methods are abstract
	
	void breaking ();
}
	// we can extend ONLY 1 class but we can implement multiple INTERFACES
abstract class Motorcycle extends Vehicle implements Drivable { //from class to Interface, we use keyword implements
	
	public void driving () {
		System.out.println("Motorcycle is driving");
	}
}

class Bike extends Motorcycle { // concrete class
	public void breaking() {
		System.out.println("Bikes can break");
	
	}
}
class Vehicle{
	public void operateVehicle() {
		System.out.println("Operate any vehicle you need to have driving lisence");
	}
	
}

