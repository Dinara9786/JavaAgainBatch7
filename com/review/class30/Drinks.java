package com.review.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Drinks {
	public static void main(String[] args) {
		
		
		ArrayList <String> drinks = new ArrayList<>();
		drinks.add("Fanta");
		drinks.add("Cola");
		drinks.add("Shake");
		drinks.add("Mirinda");
		drinks.add("Milk");
		drinks.add("Wine");
		drinks.add("Raki");
		

		
		Iterator<String> drinkIt = drinks.iterator();
		while (drinkIt.hasNext()) {
			String drink = drinkIt.next();
			if (drink.equals("milk") || drink.equals("Wine") || drink.equals("Cola")) {
				drinkIt.remove();
				}
			}
		System.out.print(drinks + " ");
		System.out.println();
	}

}
