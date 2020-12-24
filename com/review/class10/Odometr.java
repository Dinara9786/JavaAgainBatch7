package com.review.class10;

public class Odometr {

	public static void main(String[] args) {

		// We bought a new car
		// It starts with 0000 mileage and it increases == 0001, 0002, ......9999
		// Hint: There are 4 inner loops

		for (int i = 0; i <= 9; i++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					for (int j = 0; j <= 9; j++) {
						System.out.println(i + "" + b + c + j);
					}
				}
			}
		}
	}
}
