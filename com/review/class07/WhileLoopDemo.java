package com.review.class07;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		
	int time = 10;
	
		while (time <=12) {	// this will be executed infinitely
						//but then we fixed it by adding time++
		System.out.println("Good morning");
		time++;
	}
//	while (time >12) {// this code will not be executed
//		System.out.println("Good morning");
//	}
		
		boolean isRain = true;
		
		while (isRain) {
			System.out.println("Take umbrella");
			isRain=false;
		}
		
		// how to print number from 1 to 50
		
		int num = 1;
		
		while(num<=50) {
		
			System.out.print(num+", ");
			num++;
			
		}
		System.out.println();
		
		// how to print from 20 to 30
		
		int num1 = 20;
		while (num1<=30) {
			System.out.print(num1 + ", ");
			num1++;
		}
		System.out.println();
		
		int y=10;
		while (y>=1) {
			System.out.print(y + " ");
			y--;
		}
	}
}

