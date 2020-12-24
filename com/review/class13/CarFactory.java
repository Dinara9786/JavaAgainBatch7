package com.review.class13;

public class CarFactory {

	public static void main(String[] args) {

		// building an object of the car
		// object is an istance of the class
		// car1 is reference variable
		Car car1 = new Car();

		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;

		System.out.println("=== Accessing methods from Car Class using car1=====");
		System.out.println();
		
		car1.drive();
		car1.transportPeople();
		car1.reverse();

		System.out.println(car1.make);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.year);
		System.out.println(car1.speed);

		// building an object of the car
		Car car2 = new Car();

		car2.make = "Toyota";
		car2.model = "Camry";
		car2.color = "White";
		car2.year = 2019;
		car2.speed = 210;

		System.out.println();
		System.out.println("=== Accessing methods from Car Class using car2=====");
		System.out.println();

		car2.drive();
		car2.transportPeople();
		car2.reverse();
		car2.stop();
		System.out.println("The make of the car is = " + car2.make + " and model is = " + car2.model
				+ " and the year is = " + car2.year + " and the speed is  = " + car2.speed);

		// building an object of the car
		Car car3 = new Car();

		car3.make = "BMW";
		car3.model = "X5";
		car3.color = "Grey";
		car3.year = 2020;
		car3.speed = 250;

		System.out.println();
		System.out.println("=== Accessing methods from Car Class using car3=====");
		System.out.println();

		car3.drive();
		car3.transportPeople();
		car3.reverse();

		// new Bus(); compiler will give an error
		// because we never created Bus class

	}

}
