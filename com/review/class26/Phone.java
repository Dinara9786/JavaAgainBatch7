package com.review.class26;

public abstract class Phone {
	
	public void makeCall() {
		System.out.println("Phone makes calls");
	}
	
	public void sendText() {
		System.out.println("Phone sends text");
	}
	
	public abstract void navigate();
	public abstract void playMusic();
	//public abstract void takePicture();
}


abstract class Samsung extends Phone {//every new child should provide implementation
	
	public void navigate() {
		System.out.println("Samsung installed nagivation functions");
	}
	
	public void playMusic () {
		System.out.println("Samsung plays music from Google store");
	}

}

class IPhone extends Phone {// every new child should provide implementation
	
	public void navigate() {
		System.out.println("IPhone has its own nagivation functions");
	}
	
	public void playMusic () {
		System.out.println("IPhone plays music in Apple store");
	}
//	public void takePicture() {
//		System.out.println("IPhone takes pictures adn I love them");
	}
	



