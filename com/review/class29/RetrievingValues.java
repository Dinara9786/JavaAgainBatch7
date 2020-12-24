package com.review.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class RetrievingValues {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("John");
		names.add("Jane");
		names.add("Maria");
		names.add("Mike");
		names.add("Gloria");

		// how to retrieve or access value. We are calling method .get()

		String str = names.get(3);
		System.out.println(str);

		// to retrieve values one by one
		System.out.println("-------Retrieving values from ArrayList using enhanced for loop ---------------");
		for (String name : names) {
			System.out.println(name);
			if (name.equals("Gloria")) {
				System.out.println("You are awesome");
			}
		}

		System.out.println("-------Retrieving values from ArrayList using  for regular loop ---------------");

		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			System.out.println(s);

		}

		System.out.println("-------Retrieving values from ArrayList using  for Iterator ---------------");

		Iterator<String> it = names.iterator(); // returns us Object of Iterator type // it will iterate over our collection
		while(it.hasNext()) {
			String name= it.next();
			System.out.println(name);
			
		}

	}
}
