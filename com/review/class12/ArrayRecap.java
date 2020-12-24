package com.review.class12;

public class ArrayRecap {

	public static void main(String[] args) {

		String[] colors = new String[3];

		colors[2] = "red";
		colors[1] = "blue";
		colors[0] = "pink";

		String color = null;
		for (int i = 0; i < colors.length; i++) {
			color = colors[i];
			// System.out.print(color + ", ");
		}

		System.out.println(color); // this way we are printing the last value // the last index which is red [2]

		System.out.println();
		System.out.println("==Using for each loop ====");

		for (String col : colors) {
			System.out.println(col + ", ");
			
		}

	}

}
