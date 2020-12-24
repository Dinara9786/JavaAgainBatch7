package com.review.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BestBuy {
	
	public static void main(String[] args) {
		
		Map <Integer, String> equipment = new HashMap<>();
		
		equipment.put(12345,  "Printer");
		equipment.put(12346,  "Fax");
		equipment.put(12347,  "Laptop");
		equipment.put(12348,  "Xerox");
		equipment.put(12349,  "Mouse");
		
		Set <Entry<Integer, String>> equip = equipment.entrySet();
		
		System.out.println("====================Retrieving entry using FOR LOOP ================");

		for (Entry<Integer, String> equips : equip) {
			String pair = equips.getKey() + "====" + equips.getValue();
			System.out.println(pair);
			System.out.println("=================");
		}
		
		
		System.out.println("====================Retrieving entry using ITERATOR ================");

		
		Iterator <Entry<Integer, String>> iterator = equip.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			String pair1 = entry.getKey()+ "===" + entry.getValue();
			System.out.println(pair1);
			System.out.println("====================");
			
			
		}
		
		
	}

}
