package com.review.class25;

public class Computer {
	
	String brand;
	int hours;
	
	Computer (String brand, int hours){
		this.brand = brand;
		this.hours = hours;
		
	}
	
	public void playMusic() {
		System.out.println("All computers play music");
	
}
	
	public void sound () {
		System.out.println("All computers have sound");
	}
	
}

class Apple extends Computer {

	String location;
	
	Apple(String brand, int hours, String location){
		super (brand, hours);
		this.location=location;
		
	}
	public void playMusic () {
		System.out.println(brand + " is the best to play music in" + location);
	}
	
	public void sound() {
		System.out.println(brand + " sounds better than others and can play for " + hours);
	}
}

class Lenovo extends Computer {
	
	Lenovo(String brand, int hours){
		super(brand, hours);
	}
	
	public void playMusic () {
		System.out.println(brand + " can play music too and can play for " + hours);
	}
	
	public void type() {
		System.out.println(brand + " can type");
	}
} 
class HP extends Computer {
	HP (String brand, int hours){
	super(brand, hours);
	}
	public void playMusic() {
		System.out.println(brand + " can does not play music and can play for " + hours);
	}
	
	public void quality () {
		System.out.println("Never get " + brand + " it is not good");
	}
}

class Dell extends Computer {
	Dell(String brand, int hours){
		super(brand, hours);
		
	}
	
	public void playMusic () {
		System.out.println(brand + " plays music all the time");
	}
	

}
