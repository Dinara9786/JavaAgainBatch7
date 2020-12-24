package com.review.class32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetExample {
	
	public static void main(String[] args) {

		Map <Integer, String > building = new HashMap<>();
		
		building.put(2, "Google");
		building.put(3, "Syntax");
		building.put(4, "Microsoft");
		building.put(5, "Amazon");
		building.put(3, "Google");
		building.put(7, "Syntax");
		building.put(2, "Shoro");
		
		System.out.println(building);
		
		System.out.println(building.size());
		
		Set<Entry<Integer, String>> entries = building.entrySet(); // object of Entry type // entries is our Collection
		
		System.out.println("Set of Entry Objects == " + entries);
		
		System.out.println("====retrieving  key and values using FOR LOOP============");
		System.out.println();
		
		for (Entry<Integer, String> ent : entries) {
			System.out.println(ent.getKey());
			
		}
		
		for (Entry<Integer, String> ent1 : entries) {
		
			System.out.println(ent1.getValue());
		}
		
		System.out.println("====retrieving  key and values using ITERATOR============");
		System.out.println();
		
		Iterator<Entry<Integer, String>> it = entries.iterator();
		while(it.hasNext()) {
			Entry <Integer, String> entry = it.next();
			System.out.println(entry.getKey());// +" === " + entry.getValue());
			
		}
		
		
		

		
	}

}
