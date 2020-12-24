package com.review.class12;

public class TwoDArrayRecap {

	public static void main(String[] args) {

		String[][] animals = { { "Cow", "Sheep", "Goat", "Dog" }, 
				{ "Jaguar", "Tiger", "Puma", "Wolf" },
				{ "Hen", "Chicken", "Goose", "Duck" }, 
				{ "Dolphin", "Shark", "Wale" } 
				};

		int howManyRows = animals.length;
		System.out.println("How many rows ==> " + howManyRows); // it gives me a number of rows
		int numberOfElementsOnRow2 = animals[1].length; // it gives me a number of columns
		System.out.println("The number of elements on row 2 with index [1] == > " + numberOfElementsOnRow2);

		System.out.println();
		System.out.println("=== How to get all the elements in 2DArray====");

		for (int i = 0; i < animals.length; i++) { // loops over rows or over 1D Array
			for (int j = 0; j < animals[i].length; j++) { // loops of column of each row
				if (animals.equals("Wolf")) {
				System.out.println(animals);
				}

//				String animal = animals[i][j];
//
//				System.out.print(animal + " ");
			}
//			System.out.println();
//
		}
//
//		System.out.println();
		
		System.out.println("=========USING ENHANCED FOR LOOP ================");
		
		for (String [] array : animals) {
			for (String arr : array) {
				System.out.print(arr + " ");
				
				if(arr.equals("Wale")) {
					System.out.println(arr);
				}
			}
			//System.out.println();
		} 

	}
		
}
