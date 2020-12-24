package com.review.class31;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question {
	public static void main(String[] args) {

		// how to remove all duplicates from ArrayList

		List<String> aList = new ArrayList<>();

		aList.add("John");
		aList.add("John");
		aList.add("Maria");
		aList.add("Jane");
		aList.add("Maria");
		aList.add("Olga");
		aList.add("Jane");

		Set<String> list = new LinkedHashSet<>(aList);
		// list.addAll(aList);

		System.out.println(list);

		Set<String> countries = new LinkedHashSet<>();
		countries.add("Kazakhstan");
		countries.add("USA");
		countries.add("Germany");
		countries.add("Italy");
		countries.add("Great Britain");
		countries.add("France");

		// how to get/retrieve 1 specific element

		// we can loop and put if condition

		List<String> countryList = new ArrayList<>(countries);
		String country = countryList.get(2);
		System.out.println(country);

	}

}
