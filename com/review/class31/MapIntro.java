package com.review.class31;

import java.util.HashMap;

public class MapIntro {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<>();
		
		//storing objects inside map as a Key and value Pair
		hmap.put(10, "John");// entry objects
		hmap.put(11, "Jane"); // entry objects
		hmap.put(12, "James");
		hmap.put(15, "Mary");
		hmap.put(10, "George");
		
		System.out.println(hmap);
		
		// cannot have duplicate keys but we can have duplicate values
		
		hmap.put(12,  "Gozde");
		hmap.put(13,  "Olga");
		hmap.put(18, "Mary");
		
		// inside the map we cannot have duplicate keys but we can update the value
		System.out.println(hmap);
		
		// how many entry objects inside the MAP?
		
		int entryObjects = hmap.size();
		System.out.println(entryObjects);
		
		// how to check in map has any elements?
		
		boolean isEmpty = hmap.isEmpty();
		System.out.println(isEmpty);
		
		// check if map has spedific key or value?
		
		boolean hasKey = hmap.containsKey(12);
		System.out.println("Map contains key object 12 => " +hasKey);
		
		boolean hasValue = hmap.containsValue("Gozde");
		System.out.println("Map contains value object Gozde => " +hasValue);
		
		// how to retrieve 1 value from the MAP
		
		String getValue = hmap.get(13);// gets' the value of specified key
		System.out.println("Value of key 13 is ==> "+getValue);
	
		// how to remove a key from a map
		String removeValue = hmap.remove(15);
		System.out.println("We removed value of key 15 ==> "+removeValue);
		System.out.println(hmap);
		
		
		
	}

}
