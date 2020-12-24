package com.review.class24;

public class CompileTimePolymorphism {
	
	public static void main(String[] args) {
		
		String str = "Saturday";
		String day = str.substring(5);
		String satur = str.substring(0,5);
		System.out.println(day);
		System.out.println(satur);
	}

}
