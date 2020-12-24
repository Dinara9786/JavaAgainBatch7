package com.review.class23;

public class MethodOverloading {
	
	// let's create a method add
	// how we can method Overloading within the same class and methods with same name:
	
	//1. by changing number of parameters
	public int sum (int num1, int num2) { // this is return type since there is VOID 
		//sum (int num1, int num2) = this is method signature = name and parameters
		
		return num1+num2;
	}
	
	//public void sum (int num1, int num2) {// compiler will give an error because we change return type and did not change method signature
	// CE: we cannot overload method by changing return type ONLY
		
	public int sum (int num1, int num2, int num3) {
		
		return num1+num2+num3;
		
		}
	// 2. by changing type of parameters
	
	public double sum (double num1, double num2) {
		return num1+num2;
		
	}
	
	public double sum (double num1, double num2, double num3) {
	
	return num1+num2+num3;
}
}