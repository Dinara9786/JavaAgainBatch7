package com.review.class31;

public abstract class CreditCard {
	
	String type;
	
	CreditCard(String type) {
		this.type = type;
	}
	
	public abstract void deposit() ;
	
	public void withdraw() {
		System.out.println("You can withdraw in this bank");
	}
	
}

class BOA extends CreditCard{
	
	BOA (String type) {
		super(type);
	}
	
	public void deposit () {
		
		System.out.println("you can deposit in BOA");
		
	}

}

class Citi extends CreditCard {
	
	double interest;
	
	Citi (String type, double interest) {
		super(type);
		this.interest = interest;
	}
	public void deposit() {
		System.out.println("This bank is reliable");
	}
	
	public void withdraw() {
		System.out.println("You can withdraw in this bank");
	}
	
	public void chargeInterest(){
		
		System.out.println("This bank charges interest per " + interest);
		
	}
	
	
}
class Chase extends CreditCard {
	
	String atm;
	Chase (String type, String atm) {
		super(type);
		this.atm = atm;
	}
	public void deposit() {
		System.out.println("This bank is reliable");
	}
	
	public void withdraw() {
		System.out.println("You can withdraw in this bank and they have " + atm);
	}
	
	
}





