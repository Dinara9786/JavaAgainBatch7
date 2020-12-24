package com.review.class26;

public class VehicleTest {
	public static void main(String[] args) {
	
	Vehicle lambo = new Lamborgini("iuy234");
	lambo.start();
	lambo.stop();
	lambo.openTrunk();
	lambo.drive();
	
	int total = Vehicle.getTotal();
	System.out.println(total);
	
	System.out.println("===Second Object=========");
	Car car = new Lamborgini("lkj987");
	car.start();
	car.stop();
	car.openTrunk();
	car.drive();
	
	int total1 = Car.getTotal();
	System.out.println(total1);
	
	Lamborgini lambo1 = new Lamborgini("987987");
	
	int total2 = Lamborgini.getTotal();
	System.out.println(total2);
	
	
	}
}
