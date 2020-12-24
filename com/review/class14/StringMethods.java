package com.review.class14;

public class StringMethods {

	public static void main(String[] args) {

		// 1 way to create String using String literal --> this is the most popular way

		String name = "Olga"; // literal

		// 2 way to create String using NEW keyword

		String name1 = new String();
		name1 = "Jane";

		System.out.println(name);
		System.out.println(name1);

		// method of String class

		String school = "Syntax"; // String is a sequence of characters
		System.out.println("============== .length() method =======================");

		// how many characters are in the String
		int schoolSize = school.length();
		System.out.println("The length of the string1 is => " + schoolSize);

		String greetings = "Hello Syntax";

		int greetingsSize = greetings.length();
		System.out.println("The length of the string2 is => " + greetingsSize);

		System.out.println();
		System.out.println("============== .toUpperCase() method =======================");

		String city = "Washington D.C.";
		String cityUpperCase = city.toUpperCase();
		System.out.println("City is => " + cityUpperCase);

		System.out.println();
		System.out.println("============== .toLowerCase() method =======================");

		String cityLowerCase = cityUpperCase.toLowerCase();
		System.out.println("New city is => " + cityLowerCase);

		System.out.println();
		System.out.println("============== .concat() method =======================");

		String country = "USA ";
		String capital = "Washington D.C.";

		String countryAndCapital = country.concat(capital);
		System.out.println("Country and its Capitals is => " + countryAndCapital);
		System.out.println(country + capital);

		int day = 27;
		String month = " July";

		System.out.println(day + month);

		// month.concat(day); // we cannot use .concat() because both values should be
		// String

		// .contact() method works only with String

		// + with Strings serves as concatenation operator
		// + with numbers serves as arithmetic operator

		System.out.println();
		System.out.println("============== .isEmpty() method =======================");

		String hello = "Hello";
		boolean isEmpty = hello.isEmpty();
		System.out.println("String is empty => " + isEmpty);

		String word = ""; // no spaces, it is not counted
		boolean isEmpty1 = word.isEmpty();
		System.out.println("String is empty => " + isEmpty1);

		String word2 = " "; // space should be counted,
		boolean isEmpty2 = word2.isEmpty();
		System.out.println("String is empty => " + isEmpty2);

		System.out.println();
		System.out.println("============== .trim() method =======================");

		String cat = "My cat's name is Jessy";
		String dog = "     My dog's name is       Charley       ";

		System.out.println();
		System.out.println("===before trimming==========");

		System.out.println(cat);
		System.out.println(dog);

		System.out.println();
		System.out.println("===after trimming==========");

		System.out.println(cat.trim());
		System.out.println(dog.trim());
		// trim removes spaces before and after and never in the middle

		System.out.println();
		System.out.println("==========.contains() method============");

		// checks if Strign contains another sequence of specified characters
		String str = "Good afternoon All";

		boolean contains = str.contains("afternoon");
		System.out.println(contains);

		String searchValue = "good";

		boolean isItThere = str.contains(searchValue);
		System.out.println(isItThere);

		System.out.println(str.contains("A"));
		System.out.println(str.contains("after"));

		System.out.println();
		System.out.println("=======.startsWith() method ================");

		String drink = "Welcome students";
		boolean starts = drink.startsWith("Welcome");
		System.out.println(starts);

		System.out.println();
		System.out.println("=======.endsWith() method ================");

		boolean ends = drink.endsWith("a");
		System.out.println(ends);

		// drink.startsWith('w'); CE: we need to check if it starts with specified
		// String, cannot be just char

		String str1 = "Hello Mohammad";
		String str2 = "Hello Bulat";

		System.out.println(str1.startsWith("Hello"));
		System.out.println(str2.endsWith("Bulat"));

		System.out.println();
		System.out.println("=======.equals() method ================");

		String string1 = "Saturday";
		String string2 = "saturday";

		boolean equality = string1.equals(string2);

		System.out.println(equality);

		System.out.println();
		System.out.println("=======.equalsIgnoreCase() method ================");

		boolean equality2 = string1.equalsIgnoreCase(string2);
		System.out.println(equality2);

		String expectedValue = "Password cannot be empty"; // this is what we see
		String actualValue = "Password cannot be empty";

		if (expectedValue.equals(actualValue)) {
			System.out.println("The Test PASS");
		} else {
			System.out.println(" The test FAIL");
		}

		System.out.println();
		System.out.println("======= REAL EXAMPLE of .equalsIgnoreCase() method ================");

		String expectedBrowser = "Chrome";
		if (expectedBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("The test executed on chrome browser");
		} else {
			System.out.println("The test executed NOT on chrome browser");
		}

	}

}
