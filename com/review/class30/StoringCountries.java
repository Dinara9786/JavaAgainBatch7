package com.review.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class StoringCountries {
	
	public static void main(String[] args) {
		
		Country[] countr = {new USA ("USA"), new Afghanistan("Afghanistan"), new Kazakhstan("Kazakhstan")};
		
		ArrayList <Country> countries = new ArrayList<>();
		countries.add(new USA("USA"));
		countries.add(new Afghanistan("Afghanistan"));
		countries.add(new Kazakhstan("Kazakhstan"));
		
		System.out.println("========Regular For LOOP=======================");
		for (int i = 0; i<countries.size(); i++) {
			countries.get(i).election();
			
		}
		System.out.println();
		System.out.println("=======FOR EACH LOOP=======================");
		for (Country country : countries) {
			country.election();
		}
		
		System.out.println();
		System.out.println("========ITERATOR=======================");
		Iterator<Country>it = countries.iterator();
		while (it.hasNext()) {
			it.next().election();
			
		}
		
		
	}

}
