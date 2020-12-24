package com.review.class11;

public class RetrievingValuesFromTwoDArryas {
	public static void main(String[] args) {

		// Put the months fro each season in one row

		String[][] months = { { "December", "January", "February" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		int rows = months.length; // number of rows or arrays inside
		System.out.println("There are 4 rows in 2DArray == " + rows);

		int winterLength = months[0].length; // number of columns in the row
		System.out.println("There are " + winterLength + " columns in the row");

		int lastRowSize = months[2].length;
		int lastRowSize1 = months[rows - 1].length; // another way to see how many column in the row
		System.out.println("The number of columns in the 3rd row is == " + lastRowSize);
		System.out.println();
		System.out.println("The number of columns in the 3rd row is == " + lastRowSize1);

		// Nested loops are married to 2D Arrays

		for (int row = 0; row < months.length; row++) // iteratig over the rows
			for (int col = 0; col < months[row].length; col++) {
				System.out.print(months[row][col] + ", ");
			}

		System.out.println();

	}

}
