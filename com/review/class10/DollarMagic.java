package com.review.class10;

public class DollarMagic {
	public static void main(String[] args) {

		// Let us print
		// $$$$
		// $ $
		// $ $
		// $ $
		// $$$$

		for (int r = 1; r <= 5; r++) { // The out loop controls the rows
			for (int c = 1; c <= 4; c++) { // The inner loop controls the columns
				if (r == 1 || r == 5) { // If I am on the 1 row or 5 row please print everything
					System.out.print("$");
				} else { // print in the other rows
					if (c == 1 || c == 4) { // in the first or last column print $
						System.out.print("$");
					} else { // in the other columns print " "
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}

	}
}

// HW: re-do this taks without using nested if
// Hint: You should use logical && + ||
