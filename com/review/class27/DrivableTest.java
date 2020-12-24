package com.review.class27;

public class DrivableTest {
	
	public static void main(String[] args) {
		
		// new Drivable // CE: cannot instantiate, we cannot create object of Interface
		// new Motorcycle // CE: cannot instantiate, we cannot create object of abstract class
		
		Motorcycle m = new Bike();
		
		m.operateVehicle();
		m.breaking();
		m.driving();
		
		Drivable d = new Bike();// compiler will give access only to type which is Drivable and not to object which is Bike
		d.breaking();
		d.driving();
		
		System.out.println(Drivable.DRIVE); // static variable able from class to class
		System.out.println(Motorcycle.DRIVE);
		System.out.println(Bike.DRIVE);
		
		Vehicle v = new Bike(); // Vehicle -- > Motorcycle --> Bike 
		Vehicle v2 = new Vehicle();
		v.operateVehicle();// during compilation the compiler refers to type which is Parent (Vehicle)
		
				
		
		
		
	}

}
