package com.review.class31;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {
	public static void main(String[] args) {
		
		// create a map of grocery that will hold (item: price)
		
		// HashMap does not preserve insertion order
		Map <String, Double> grocery = new HashMap<>();
		
		grocery.put("Apple", 1.99);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 5.99);
		grocery.put("Milk", 4.40);
//		grocery.put(null, 0.99);
//		grocery.put(null,  null);
		
		System.out.println(grocery);
		
		
		// LinkedHashMap preserves insertion order
		Map <String, Double> mall = new LinkedHashMap<>();
		
		mall.put("Colone", 99.99);
		mall.put("TShirt", 15.99);
		mall.put("Shoes", 99.99);
		mall.put("Soap", 1.99);
		mall.put("Colone", 99.99);
		mall.put("Tea", 3.99);
//		mall.put(null, null);
//		mall.put(null, 3.99); // if value is duplicated that it updates 
		
		System.out.println(mall);
		
		Map<String, Double> shoppingList =new TreeMap<>();// preserves the order in ascending order = keys
		shoppingList.putAll(grocery);
		shoppingList.putAll(mall);
		System.out.println(shoppingList);
		
		Map<String, Double> htable = new Hashtable<>();
		
		htable.put("House", 600000.00);// Hashtable also guarantees no null keys and no null values/ Hashtable is also called as legacy class. 
		htable.put("Car", 6000.00);
		htable.put("food",  100.00);
		htable.put("food",  100.00);
		//htable.put(null,  null);
		
		
		System.out.println(htable);
		
		// Hashmap and LInkedHashMapo can have at least 1 null key and multiple null values
		// TreeMap allows null value, but does not allow null keys
		
		
		
	}

}
