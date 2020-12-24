package com.review.class32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class City {

	public static void main(String[] args) {

		Map<String, Integer> cities = new TreeMap<>();

		cities.put("Paris", 1);
		cities.put("Rome", 5);
		cities.put("New York", 7);
		cities.put("Seattle", 6);
		cities.put("Ohio", 18);
		cities.put("Washinton D.C.", 20);
		cities.put("Los Angeles", 11);

		System.out.println(cities);

//		Set<Entry<String, Integer>> city = cities.entrySet();
//
//		Iterator<Entry<String, Integer>> it = city.iterator();
//		while (it.hasNext()) {
//			Entry<String, Integer> entry = it.next();
//			if (entry.getKey().length() > 7 && entry.getValue() > 7) {
//				it.remove();
//			}
//		}
//		System.out.println(cities);

		Set<String> keys = cities.keySet();
		Iterator<String> k = keys.iterator();
		while (k.hasNext()) {
			String key = k.next();
			if (key.length() > 7) {
				k.remove();
			}
		}

		System.out.println(keys);
		System.out.println(cities);

		System.out.println(" =========Improved Way=======");

		String[] citi = { "Washington", "Los Angeles", "New York", "Miami" };

		Map<String, Integer> cityMap = new TreeMap<>();

//		for (int i=0; i<citi.length; i++) {
//			cityMap.put(citi[i], citi[i].length());
//		}
//		System.out.println(cityMap);

		for (String c : citi) {
			// if(c.length()<7) {
			cityMap.put(c, c.length());
		}
		System.out.println(cityMap);

		Set<Entry<String, Integer>> entrySet = cityMap.entrySet();

		Iterator<Entry<String, Integer>> set = cityMap.entrySet().iterator();
		while (set.hasNext()) {
			Entry<String, Integer> entry = set.next();
			if (entry.getValue() > 7) {
				set.remove();
			}

		}

		System.out.println("Map after removal==" + cityMap);
	}
}
