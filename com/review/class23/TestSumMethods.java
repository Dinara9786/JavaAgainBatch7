package com.review.class23;

public class TestSumMethods {
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		double result = obj.sum(10.99, 2.99);
		System.out.println(result);
		System.out.println(obj.sum(10,  20, 30));
		// compiler will implement looking into the method signature
		
		System.out.println();
		
	}

}
