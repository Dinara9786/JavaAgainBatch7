package com.review.class31;

public abstract class Insurance {

	public String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;

	}

	public abstract void getQuote();

	public abstract void cancelInsurance();
}

class Car extends Insurance {

	public String carModel;

	Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	public void getQuote() {
		System.out.println("Car model of " + carModel + " " + " will get quote");
	}

	public void cancelInsurance() {
		System.out.println("Car will cancel insurance");
	}
}

class Pet extends Insurance {

	public String petType;

	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	public void getQuote() {

		System.out.println("Pet " + petType + " will get quote");

	}

	public void cancelInsurance() {
		System.out.println("Pet will cancel insurance");
	}
}

class Health extends Insurance {

	Health(String insuranceName) {
		super(insuranceName);
	}

	public void getQuote() {

		System.out.println("Everybody should get health insurance quote");

	}

	public void cancelInsurance() {
		System.out.println("Everybody should not cancel health insurance");

	}

}
