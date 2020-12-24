package com.review.class03;

public class PrimitiveCasting {
	public static void main(String[] args) {
		
		// widening and it is done automatically. it is implicitly
		double d = 7; // we can store int in double
		
		//int i = 7.67; // Compile time error: we cannot store double in int
		
		
		//narrowing and it is done manually. it is explicitly
		int i = (int) 7.67;// we are converting 
		System.out.println(i);
		
		// = assignment operator
		
	}

}
