package com.review.class15;

public class StringImmutable {
	public static void main(String[] args) {

		String str = "Today is a good day"; // new object gets created
		str = str.replace("good", "amazing"); // completely new String Object is getting created
		System.out.println(str);

		str.concat(". I love Sundays"); // new object gets created but no one is referring to that object
		System.out.println(str); // original str did nto get changed

		String str1 = new String("Hello");
		str1.toLowerCase();
		System.out.println("value of str1 is still the same => " + str1);
		str1 = str1.toLowerCase();// we re-assgined
		System.out.println("After re-assigned str1 => " + str1);
		String str2 = "Hello";
		String str3 = "Hello";
		
		String str5 = new String ("Hello");
		

	}

}
