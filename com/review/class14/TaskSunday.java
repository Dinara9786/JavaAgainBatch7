package com.review.class14;

public class TaskSunday {
	public static void main(String[] args) {

		String word = "Sunday";

		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));

		}
		System.out.println();

		String word1 = "Syntax";

		if (!word1.isEmpty()) {
			if (word1.length() % 3 == 0) {
				if (word1.length() > 3) {
					int size = word1.length();
					System.out.println("The character in the middle is => " + word1.charAt(size / 2));
				}
			}

		} else {
			System.out.println("The String is even");

		}

		System.out.println("================Another Reverse==============");

		String syntax = "Technologies";

		for (int r = syntax.length() - 1; r >= 0; r--) {
			System.out.print(syntax.charAt(r));
		}
		
		System.out.println();
		String anotherWord = "Barabashki";
		
		
		for (int b = anotherWord.length()-1; b>=0; b-- ) {
			System.out.print(anotherWord.charAt(b));
		}
		System.out.println();
		
		String day = "Sunday"; 
		day.charAt(1); // gives one character and it is no longer a string and we cannot convert to upper case , because charAt works for String only
		// if we want to get back one character in upper case then we convert String first to Upper case and then call method chartAt()
		
		char d = day.toUpperCase().charAt(1);
		System.out.println(d);
		
		String d2 = day.substring(day.length()/2);
		System.out.println(d2);
		
		String d3 = day.substring(day.length()/2).toUpperCase();
		System.out.println(d3);
		
		String word3 = "Barabashki";
		int size = word3.substring(2).toUpperCase().length();
		System.out.println(size);
		
		String word4 = "Balabolki";
		String newString = "";
		
		for (int n= word4.length()-1; n>=0; n--) {
			newString+=word4.charAt(n);
		}
		System.out.println(newString);
		
	}

}
