package com.review.class35;

public class FinallyBock {
	
	public static void main(String[] args) {
		
		String str = "Java";
		
		try {
			System.out.println(" I am try block");
			char letter = str.charAt(10);
			System.out.println(letter);
//		} catch (Exception e) {
//			System.out.println("I am a catch block");
//		System.out.println(e);
		} finally {// always gets executed regardless if E occurs or not 
			System.out.println("I am finally block"); // this will be executed all the time no matter what 
		}
		System.out.println("I am the end of the code");
		
		
	}

}
