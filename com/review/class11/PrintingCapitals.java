package com.review.class11;

public class PrintingCapitals {
	public static void main(String[] args) {

		String[] countries = { "Russia", "Greec", "Philippines", "Italy", "France", "United States of America",
				"Canada", "Germany" };

		String[] capitals = { "Moscow", "Athens", "Maila", "Rome", "Paris", "Washington D.C.", "Montreal", "Berlin" };

		for (int i = 0; i < countries.length; i++) {
			String country = countries[i];
			String capital = capitals[i];
			System.out.println("The capital of " + country + " is == " + capital);
		}

	}

}
