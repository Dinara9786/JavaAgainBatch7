package com.review.class23;

public class IceCream {
	
	String flavor, brand, color;
	
	public IceCream(String flavor, String brand, String color) {
		this.flavor = flavor;
		this.brand = brand;
		this.color = color;
		
	}
}

class Gelato extends IceCream {
		
	public Gelato (String flavor, String brand, String color) {
		super(flavor, brand, color);
		
	}
}

class Sorbeto extends IceCream {
	
	double price;
	
	public Sorbeto (String flavor, String brand, String color, double price) {
		super(flavor, brand, color); // a call to parent constructor should be always first line
		this.price = price;
	}	
}

class MiniSorbeto extends Sorbeto {//Sorbeto is immediate parent of MiniSorbeto
	
	int calories;
	
	MiniSorbeto (String flavor, String brand, String color, double price, int calories) {
		super (flavor, brand, color, price);
		this.calories=calories;
			
	}
	}

		
		
		
		
		
	
