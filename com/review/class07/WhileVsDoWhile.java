package com.review.class07;

public class WhileVsDoWhile {
	
	public static void main(String[] args) {
		
		System.out.println("WHILE checks if soup is not, before eating");
		System.out.println("DO WHILE first eats adn then checks adn you will burn");
		
		System.out.println("=== Using While =====");
		
		int x = 1; 
		while (x<=3) { // checks before going into the loop
			System.out.println("Hello");
			x++;
		}
		
		System.out.println("=== Using a Do While =====");
		
		int y=1; 
		
		do { // first print and increment and then checks
			System.out.println("Hello");
			y++;
		} while (y<=3);// checks after going into the loop
		
	}

}
