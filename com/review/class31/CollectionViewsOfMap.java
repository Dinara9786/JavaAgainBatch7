package com.review.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionViewsOfMap {

	public static void main(String[] args) {

		Map<String, Double> grocery = new LinkedHashMap<>();

		grocery.put("Apple", 1.99);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 5.99);
		grocery.put("Milk", 4.40);

		System.out.println(grocery);

		double value = grocery.get("Milk");
		System.out.println(value);

		// how to get all the values

		Collection<Double> values = grocery.values();

		System.out.println("============get all values 1 by 1 using loop======");

		for (Double val : values) {
			System.out.println(val);

			System.out.println("============get all values 1 by 1 using Iterator======");

		}
		// Iterator is our collection and we can use only Object

		Iterator<Double> itValue = values.iterator();// since we are using Collection for getting values then our collection
												// is values.
		while (itValue.hasNext()) {
			double val = itValue.next();
			System.out.println(val);

		}
		
		// how to get all the keys
		
		Set<String>keys = grocery.keySet();
		
		System.out.println("============get all keys 1 by 1 using Iterator======");
		
		Iterator<String> key = keys.iterator ();// keys is my iterator
		while(key.hasNext()) {
		String keyIterator = key.next();
		System.out.println(keyIterator+ " ===== " + grocery.get(keys)); // complete this task to get keys and value as a pair
		
		
		
		}
		System.out.println("============get all keys 1 by 1 using loop======");
		
		 // I want to print key + pair together

		for (String keyss:keys) {
			System.out.println(keyss+" and its VALUE is "+ grocery.get(keyss));
		}
	}
}
