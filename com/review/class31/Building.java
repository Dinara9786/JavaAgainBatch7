package com.review.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Building {
	
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
		
		building.put(4, "Azure");
		System.out.println(building);
		
		String company = building.get(2);
		System.out.println(company);
		
		building.remove(7);
		
		System.out.println("The building composition after removing company on 7 floor and updating 4 floor " + building);
		
		Collection<String> values = building.values();
		
		System.out.println("======retrieving values using for each loop==========");
		for (String v : building.values()) {
			System.out.println(v);
		
			System.out.println("======retrieving values using Iterator==========");
			
		Iterator <String >value = values.iterator();
		while (value.hasNext()) {
			String val = value.next();
			System.out.println(val);
			
			// another way using Iterator
			
			//Iterator <String> valuesIterator = building.values().iterator();
			//while (valuesIterator.hasNext) {
			//	System.out.println(valuesIterator.next());
			
			// another chain of methods
			System.out.println("===========something==============");
			String something = building.values().iterator().next();
			//Integer k = building.keySet().iterator().next().remove();// did not work?
			//System.out.println(k); // did not work?
			//building is Map (key and value)
			// values is Collection (
			//iterator is Iterator
			//next is String 
			
			}
		}
		
		System.out.println("======retrieving keys and values using Iterator==========");
		Set <Integer> keys = building.keySet();
		
		Iterator<Integer> key = keys.iterator();
		
		while (key.hasNext()) {
			int keyss = key.next();
			System.out.println(keyss+" and its VALUE is "+ building.get(keyss));
			//System.out.println(key.next() + " value == " + building.get(key.next())); // this line won't work
		}
		
		System.out.println("======retrieving keys and values using for each loop==========");
		
		for (Integer keysss: keys) {
		
			System.out.println(keysss+" and its VALUE is "+ building.get(keysss));
		}
	}

}
