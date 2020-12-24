package com.review.class30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> food = new LinkedList<>();
		food.add("bashparmak");
		food.add("pizza");
		food.add("biryani");
		food.add("tacos");

		String myFood = food.get(2);
		System.out.println(myFood);

		LinkedList<String> deserts = new LinkedList<>();
		deserts.add("cake");
		deserts.add("ice cream");
		deserts.add("cookies");

		food.addAll(deserts);
		System.out.println(food);

		food.remove("pizza");
		System.out.println(food);

		food.set(3, "brownie");
		System.out.println(food);

		// I want to get all values one by one

		Iterator<String> foodIterator = food.iterator();
		while (foodIterator.hasNext()) {
			String foood = foodIterator.next();
			System.out.print(foood + " ");
			if (foood.equals("cookies") || foood.equals("brownie")) {
				foodIterator.remove();
			}

		}
		System.out.println(food);
		
		LinkedList <Country> countries = new LinkedList<>();
		countries.add(new USA ("USA"));
		countries.add(new Kazakhstan ("Kazakhstan"));
		countries.add(new Afghanistan("Afghanistan"));
		
		System.out.println("Collection of Country Objects has " + countries.size() + " elements");
		
		for (Country countr: countries) {
			countr.election();
		}
		
		// this is example of Polymorphism
		List<String > webelements = new ArrayList<>(); // I am storing objects of String type
		webelements.add("Link");
		webelements.add("radio button");
		webelements.add("frames");
		
		
	}

}
