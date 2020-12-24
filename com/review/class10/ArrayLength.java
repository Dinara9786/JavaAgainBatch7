package com.review.class10;

public class ArrayLength {
	public static void main(String[] args) {
		
		String [] names = new String [5];
		names[0] = "Matsunaki";
		names[2] = "Katsuo";
		names[4] = "Mitsui";
		
		System.out.println(names[3]);
 		
		int arrayLength = names.length;
		System.out.println("The length of the array is " + arrayLength);
		
	}

}
