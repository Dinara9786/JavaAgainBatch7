package com.review.class26;

public class PhoneTest {
	public static void main(String[] args) {
		
		//Phone phone = new Phone();//CE: we cannot create an object of Abstract class
		
		Phone iphone = new IPhone();
		iphone.makeCall();
		iphone.navigate();
		iphone.playMusic();
		iphone.sendText();
		
		Phone samsung = new IPhone();
		samsung.makeCall();
		samsung.navigate();
		samsung.playMusic();
		samsung.sendText();
		
		
	}

}
