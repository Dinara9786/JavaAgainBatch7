package com.review.class15;

public class Task1 {
	
	public static void main(String[] args) {
		
		String str = "I am a great personality";
		String str1 = str.replaceAll(" ", "");
		System.out.println(str1);
		
		String combination = "I am 50 years old & my salary is over $100000 a year!!!";
		 combination = combination.replaceAll("[A-Za-z0-9]", "");
		int numberOfAlphaCharacters=combination.replaceAll(" ", "").length();
		System.out.println(numberOfAlphaCharacters);
		
		System.out.println();
		
		String day = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String [] array = day.split("[?]");
		int howManyElements = array.length;
		System.out.println("There are => " + howManyElements + " elements in the String");
		
		for (String s: array) {
			System.out.print(s + "|");
		}
		System.out.println();
		
	}

}
