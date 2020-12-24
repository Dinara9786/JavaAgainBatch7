package com.review.class12;

public class Task {

	public static void main(String[] args) {

		/*
		 * create 2D array that will store food of different kinds retrieve values using
		 * for loop and for each loop
		 */

		String[][] food = { 
				{ "Uha", "Borch", "Pelmeni", "Minestrone" }, 
				{ "Cake", "Buisuits", "Pancakes", "Donuts" },
				{ "Pizza", "Manty", "Lagman", "Salmon" }, 
				};

		for (int r = 0; r < food.length; r++) {
			for (int c = 0; c < food[r].length; c++) {
				if (food[r][c].equals("Pelmeni")){
				System.out.print(food[r][c] + " ");
			}

			//System.out.println();
		}
		}

		System.out.println();
		System.out.println("=============USING FOR EACH LOOP===============");

		for (String[] food1 : food) {
			for (String food2 : food1) {
				if (food2.equals("Donuts")) {
				System.out.print(food2+ " ");
			}
			//System.out.println();
		}
		}
	}
	}

