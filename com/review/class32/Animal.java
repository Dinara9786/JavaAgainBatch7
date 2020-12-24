package com.review.class32;

public abstract class Animal {

	protected String type;
	protected String color;

	public Animal(String type, String color) {
		this.type = type;
		this.color = color;
	}

	abstract void eat();

	abstract void sleep();

}

class Dog extends Animal {

	Dog(String type, String color) {
		super(type, color);

	}

	public void eat() {
		System.out.println(type + " eats bones");
	}

	public void sleep() {
		System.out.println(type + " sleeps at home");
	}

}

class Zebra extends Animal {

	Zebra(String type, String color) {
		super(type, color);
	}

	protected void eat() {
		System.out.println(type + " eats grass");
	}

	protected void sleep() {
		System.out.println(type + " sleeps");
	}

}

class Monkey extends Animal {

	Monkey(String type, String color) {
		super(type, color);
	}

	@Override
	void eat() {
		System.out.println(type + " eats banana");
	}

	@Override
	void sleep() {
		System.out.println(type + " sleeps a lot");
	}

}
