package com.review.class31;

public abstract class Insurance01 {

	String insurance;

	public Insurance01(String insurance) {
		this.insurance = insurance;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();
}
	class Car01 extends Insurance01 {

		String carModel;

		Car01(String insurance, String carModel) {
			super(insurance);
			this.carModel = carModel;

		}

		public void getQuote() {
			System.out.println(carModel + " has " + insurance);
		}

		public void cancelInsurance() {
			System.out.println(carModel + " cancelled unreliable " + insurance);
		}
	}

	class Pet01 extends Insurance01 {

		String petType;

		Pet01(String insurance, String petType) {
			super(insurance);
			this.petType = petType;

		}

		public void getQuote() {
			System.out.println(petType + " has " + insurance);
		}

		public void cancelInsurance() {
			System.out.println(petType + " cancelled unreliable " + insurance);
		}
	}

	class Health01 extends Insurance01 {

		Health01(String insurance) {
			super(insurance);

		}

		public void getQuote() {
			System.out.println("this type of insruance is good " + insurance);
		}

		public void cancelInsurance() {
			System.out.println(" You may cancel any  unreliable " + insurance);
		}
	}


