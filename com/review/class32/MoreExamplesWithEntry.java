package com.review.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MoreExamplesWithEntry {
	public static void main(String[] args) {
		
		
		Map<String, String>movies = new TreeMap<>();
		
		movies.put("Comedy", "Movie 43");
		movies.put("Horror", "Bird Box");
		movies.put("Fiction", "Avengers");
		movies.put("Action", "James Bond");
		movies.put("Romance", "Harry Potter");
		
		System.out.println(movies);
		
		System.out.println("====================Retrieving entry using Iterator================");
		System.out.println(); // this is empty line
		
		Set<Entry <String, String>> allEntries = movies.entrySet();// Collection of Entry Objects
		
		Iterator<Entry<String, String>> iterate = allEntries.iterator();
		while(iterate.hasNext()) {
			Entry<String, String> it = iterate.next();
			String key = it.getKey();
			String value = it.getValue();
			
			//System.out.println(it.getKey() + " ==== " +it.getValue());
			System.out.println(key +" ===== " + value);
		}
		
		System.out.println("====================Retrieving entry using FOR LOOP ================");
		System.out.println();
		
		for (Entry<String, String > entry :allEntries) { // we should specify our collection which is allEntries
			String key2 = entry.getKey();
			String value2 = entry.getValue();
			
			System.out.println(key2 + " === " + value2);
		}

		
		
		
		
	}

}
