package com.review.class10;

public class ArrayIntro {
	
	public static void main(String[] args) {
		
		// Array is a tray of tea cups
	
		// declare and initialize one array of integers
		int [] numbers = new int [4]; // 4 elements inside
		numbers [0] = 10;
		numbers [1] = 15;
		numbers [2] = 20;
		numbers [3] = 25;
		// numbers[4] = 30 // this is wrong
		
		// access elements from the array
		System.out.println(numbers[3]);
		
		// if array is storing integers, when I get one element  I will get one int
		int element0 = numbers[0];
		
		// We are just declaring but not initializing
		String [] carArray; // this is the preferred way
		String carArray1[]; // this way is  also possible, but less preferred
		// we are creating/initializing the array
		
		carArray = new String [3]; // the size is 3 with indexes 0, 1, 2
		
		// we are storing values
		carArray[0] = "BMW";
		carArray[1] = "Toyota";
		carArray[2] = "Benz";
		//carArray[3] = "Tesla" // Will give ann runtime-error
		String car = carArray[2];
		System.out.println(carArray[1]);
		System.out.println(car);
		
		//char[4] letters = new char[]; // we cannot how many elements we are storing in the beginning. 
		 char [] letters = new char[4];
		
	}
	

}
