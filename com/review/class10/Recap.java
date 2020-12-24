package com.review.class10;

public class Recap {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("Next iteration of outer loop");

			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		int rows = 4;
		int cols = 7;

		for (int k = 1; k <= rows; k++) {
			System.out.print("We are on the " + k + " floor ---> ");
			for (int z = 1; z <= cols; z++) {
				System.out.print(k + "." + z + " ");
			}
			System.out.println();
		}

	}

}
