package com.review.class11;

public class RetrievingValues {
	
	public static void main(String[] args) {
		
		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		
		for (int i = 0; i<grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.println();
		
		System.out.println("==retrieving all the values using for each loop =======");
		
		for (char grade : grades) {
			System.out.print(grade + ", ");
		}
		System.out.println();
		
		for (int r= grades.length-1; r>=0; r--) {
			System.out.print(grades[r] + ", ");
		}
		System.out.println();
		
		String [] fruits = {"Apple", "Banana", "Cucumber", "Grapes", "Orange"};
		//fruits[2] = null;
		// print all the fruits in tow different ways
		
		for (String fruit: fruits) {
			System.out.print(fruit + ", ");
		}
		System.out.println();
		
		for (int i=0; i<fruits.length; i++) {
			System.out.print(fruits[i] + ", ");
		}
		
		System.out.println();
		
		for (int k=fruits.length-1; k>=0; k--) {
			if (fruits[k].equals("Orange")) {
					System.out.println(fruits [k]+ " is my favourite fruit ");
		} else {
		System.out.print(fruits[k] + ", ");
		
		}
			
		}
		System.out.println();
	}

}

