package com.review.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

		// we are counting from 1 to 10 and we want to stop when we reach 4
		
		System.out.println("=======BREAK==============");
		
		
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("We are outside of loop");

		for (int j = 1; j <= 10; j++) {

			System.out.println(j);

			if (j == 4) { //we are breaking at number 4
				
				System.out.println("I am stopping at number 4");
				break;
			}
		}

		System.out.println("We are outside of loop");
		System.out.println("=======CONTINUE==============");
		
		for (int k = 1; k<=10; k++) {
			if (k==4) {
				System.out.println("I am skipping number 4");
				continue;// we are skipping number 4
			}
			System.out.println(k);
		}
		
	}
}
