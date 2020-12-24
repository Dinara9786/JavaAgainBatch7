package com.review.class03;

public class Homework {
	
	// Write a Java program to add, subtract, multiply and divide 2 decimal values
	
	public static void main(String[] args) {
		
		double num1 = 3.5; 
		double num2 = 4.2;
		
		double sum = num1 + num2;
		double subt = num1-num2; 
		double mult = num1*num2;
		double div = num1/num2;
		System.out.println("The subtraction of 2 numbers " + num1 +" and " + num2 +  "is equal " + subt);
		System.out.println("The sum of 2 numbers " + num1 +" and " + num2 +  "is equal " + sum);
		System.out.println("The multiplication of 2 numbers " + num1 +" and " + num2 +  "is equal " + mult);
		System.out.println("The division of 2 numbers " + num1 +" and " + num2 +  "is equal " + div);
		
		double num4 = 3.9;
		double square = 3.9*2;
		System.out.println("The square of the " + num4 + " is " + square);
		
		int width = 5; 
		int height= 8; 
		int perimeter = (width+height)*2;
		int area = width*height;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to "  + perimeter + " and the area is " + area);
		
		
		
		
		
		
		
		
	}
	

}
