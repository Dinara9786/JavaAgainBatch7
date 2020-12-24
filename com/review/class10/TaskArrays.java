package com.review.class10;

public class TaskArrays {

	public static void main(String[] args) {

		char[] charGrades = { 'A', 'B', 'C', 'D', 'E', 'F' };

		System.out.println(charGrades[1]);

		char grade = charGrades[1];
		System.out.println(grade);

		String[] names = new String[5];

		names[0] = "Anna";
		names[1] = "Daria";
		names[2] = "Dalia";
		names[3] = "Dania";
		names[4] = "Dasha";
		
		System.out.println(names[2]);
		
		String [] words = {"Java", "Saturday", "day", "coding", "is"};
		
		// Saturday is Java coding Day
		
		String sentence = words[1]+" "+ words[4]+" "+words[0]+" "+words[3]+" "+words[2];
		System.out.println(sentence);
	}

}
