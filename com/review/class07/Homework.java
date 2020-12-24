package com.review.class07;

import java.util.Scanner;

public class Homework {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	double result=0;
	
	System.out.println("Please enter the first number");
	double num1 = scanner.nextDouble();
	
	System.out.println("Please enter the second number");
	
	double num2 = scanner.nextDouble();
	
	System.out.println("Please enter the operator +,-,*,/");
	
	char operator = scanner.next().charAt(0);
	
	switch(operator) {
	case '+':
		result = num1+num2;
		break;
	case '-':
		result = num1-num2;
		break;
	case '*':
		result = num1*num2;
		break;
	case '/':
		result = num1/num2;
		break;
	default:
		result = 0;
		System.out.println("Invalid operator");
	}
	System.out.println("The result of " + num1 + operator + " " + num2 + " is equal to " + result);
	
	}
}
