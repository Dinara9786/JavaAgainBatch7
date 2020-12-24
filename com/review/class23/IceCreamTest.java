package com.review.class23;

public class IceCreamTest {

	public static void main(String[] args) {
		
		Gelato g = new Gelato("Strawberry", "BR", "pink");
		g = new Gelato ("mint", "magnum", "green"); // re-assigning g 
		
		Sorbeto s = new Sorbeto ("Mango", "KGS", "yellow", 23.5);
		
		new MiniSorbeto ("Chocolate", "BR", "brown", 2.64, 160);
	}
}
