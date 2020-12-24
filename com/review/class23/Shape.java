package com.review.class23;

public class Shape {

	int radius;

	public Shape(int radius) {
		this.radius = radius;

	}

}

class Circle extends Shape {
	double p;

	public Circle(int radius, double p) {
		super(radius);
		this.p=p;
	}

	public double calculateArea() {
		
		return radius*p;

	}

}
