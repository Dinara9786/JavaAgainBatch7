package com.review.class23;

public class UserClass {
	
	String name; 
	String mobileNumber;
	
public UserClass(String name, String mobileNumber) {
	this.name = name; 
	this.mobileNumber = mobileNumber;
}
	
	public void userDetails() {
		System.out.println("My name is = " + name + " and my mobile number is = " + mobileNumber);
	
}
}

class UserInfo extends UserClass {
	
	String address;
	String citizenship;
	
	public UserInfo(String name, String mobileNumber, String address, String citizenship) {
		super(name, mobileNumber);
		this.address = address; 
		this.citizenship = citizenship;
	}
	
	public void userDetails () {
		System.out.println(super.name +  " " + super.mobileNumber);
		System.out.println(this.address + " " + this.citizenship + " " + name +  " " + mobileNumber);
		
		
		
		
	}
	

}
