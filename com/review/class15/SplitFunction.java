package com.review.class15;

public class SplitFunction {
	
	public static void main(String[] args) {
		
		String str = "Today is Sunday and we have a Java class";
		
		String [] array = str.split("d");// split means removes and cutting
		int howManyElements = array.length;// length is not a method
		System.out.println(howManyElements);
		
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		System.out.println("====Retrieving elements using for each loop");
		for (String s: array) {
			System.out.print(s + "|");
		}
		
		System.out.println();
		
	}

}
