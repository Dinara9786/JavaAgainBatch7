package com.review.class14;

public class StringMethodsContinued {
	
	public static void main(String[] args) {
		
		
		System.out.println("============== .charAt() method =======================");

		String season = "Summer";
		char character = season.charAt(1);
		System.out.println(character);
		
		System.out.println();
		System.out.println("============== .indexOf() method =======================");
		
		int index = season.indexOf('m'); // will return a index at specified character
		System.out.println(index);
		
		int index1 = season.indexOf('m', 3); // will return index of the same character 
		System.out.println(index1);
		
		String hello = "Hello Ksenia";
		int indexOfKsenia = hello.indexOf("Ksenia");
		System.out.println("Index of Ksenia in the String  " + hello + " is => " + indexOfKsenia); // we are taking the whole word from index starting 6
		
		System.out.println();
		System.out.println("============== .substring() method =======================");
		
		String message = "You guys are awesome";
		
		String substring = message.substring(4); // it is going to get a part from the string at specified index 4
		System.out.println(substring);
		
		String substring1 = message.substring(4, 8); // i want to get only "guys"  at specified index start from index 4 and end index 8
		System.out.println(substring1);
		
		
	}

}
