package com.review.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {
	
	
	public static void main(String[] args) {
		// create ArrayList of city names
		
		ArrayList<String>cities = new ArrayList<>();
		
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("DC");
		cities.add("New York");
		
		System.out.println("original arrayList ==" + cities);
		//remove LA and DC
		
		for (int i=0; i<cities.size(); i++) { // we grab element with index i and it loop and then remove element with index i 
			if (cities.get(i).equals("LA") || cities.get(i).equals("CD"))  { //
				cities.remove(i);
				System.out.println(cities);
			}
		}
		System.out.println("finalArray ===" + cities);
		
		// WE SHOULD NOT USE ENHANCED FOR LOOP FOR DELETING ELEMENT
		
//		for (String city : cities) {
//			if(city.equals("New York")) {
//				cities.remove(city);
//			}
//		}
//			System.out.println(cities);
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Moscow");
		System.out.println(cities);
		
		System.out.println("===THE BEST WAY TO REMOVE ELEMENT IS TO USE ITERATOR=====");
		
		Iterator<String> citiesIt = cities.iterator();
		while (citiesIt.hasNext()) {
			String ci=citiesIt.next();// we store inside the variable and thus we can delete few elements from ArrayList
			if (ci.equals("LA") || ci.equals("New York")) {
				citiesIt.remove();
			}
			
		}
		System.out.println("ArrayList after modifications from Iterator: " + cities); // deleted all LAs
		
		}
		
	}
	


