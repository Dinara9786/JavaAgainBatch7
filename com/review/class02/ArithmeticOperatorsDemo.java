package com.review.class02;

public class ArithmeticOperatorsDemo {
	
	public static void main(String[] args) {
		
		int num1 = 10; 
		int num2 = 5; 
		
		int num3 = num1;
		int sum = num1+num2;
		int sub = num1-num2;
		int div = num1/num2;
		int mult = num1*num2;
		
		System.out.println("num3 is -> " + num3 + " addition is v -> " + sum + " and substraction is ->" + sub + " and division is ->" 
		+ div + " and multiplication is ->" + mult);
		
		double d1 = 2.4;
		double d2 = 6.87;
		double dSum = d1 + d2;
		
		System.out.println(dSum);
		
		double newSum = num1 + num2; // converting int to double is safe. BUT converting double to int is risky. It is OK to store int as double 
		
		System.out.println("newSum -> " + newSum);
		
		// order of operation 
		System.out.println("Ahmet" + 10+30); // only concatenation
		System.out.println(10+30 + " Ahmet"); // first multiplication then concatenation
		System.out.println("Ahmet " + (10+30)); //first parenthesis then concatenation
		System.out.println("Ahmet " + 10*30); // first multiplication then concatenation

		
		
	System.out.println("==================H O M E W O R K============================");
	
	int n1 = 15; 
	int n2 = 17;
	int sum1 = n1+n2;
	int sub2 = n1-n2;
	int mult3 = n1*n2;
	int div4 = n1/n2;
	
	System.out.println("The sum of 2 numbers " + n1 + " and " + n2 + " is equal to " + sum);
	
	double d3 = 3.9;
	double square = d2*d2;
	
	System.out.println("The square of " + d3 + " is " + square);
	
	int width = 5;
	int height = 8;
	int area = width*height;
	int rectangle = (width+height)*2;
	
	System.out.println("The perimeter of a rectangle with width "+ width + " and height " 
	+ height+ " is equal to " + rectangle  + " and the area is " + area);
		
	}
	

}
