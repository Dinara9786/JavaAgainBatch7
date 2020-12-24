package com.review.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		// I need to create object of HashSet
		
		HashSet<String> brands = new HashSet<>();
		brands.add("Nike");
		brands.add("Adidas");
		brands.add("HM");
		brands.add("Zara");
		brands.add("Uniqlo");
		brands.add("Adidas");
		brands.add("HM");
		
		System.out.println(brands.size());
		System.out.println(brands);
		
		// how to verify if element is there?
		// I want to access teh element
		// method .add will not be availabel in HashSet and to objects of Set Type
		
		boolean isItThere = brands.contains("Nike");
		System.out.println(isItThere);
		
		Iterator<String> brand = brands.iterator();
		String obj = brand.next();
		System.out.println(obj);
		obj = brand.next();
		System.out.println(obj);
		
		while (brand.hasNext()) {
			obj = brand.next();
			System.out.println(obj);
			
		}
		// if we need to iterate over entire collection again we need NEW ITERATOR OBJECT
		
		Iterator<String>it = brands.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	
	
	// is there other way to get all the elements from Set Collection . Inside our Set we do not use indexes and we cannot use regular FOR LOOP
		// we will be using ENHANCED LOOP
		
	 for (String br:brands) {
		 System.out.println(br);
	}
	 
	 System.out.println(" Creating an object of LinkedHashSet---------");
	 
	 LinkedHashSet <String > luxBrands = new LinkedHashSet<>();
	 
	 luxBrands.add("Prada");
	 luxBrands.add("Chanel");
	 luxBrands.add("Gucci");
	 luxBrands.add("LV");
	 luxBrands.add("Gucci");
	 luxBrands.add("LV");
	 
	 System.out.println(luxBrands.size());
	 System.out.println(luxBrands); // preserve insertion order and does not keep duplicates
	 
	 
	 System.out.println(" Creating an object of TreeSet---------");
	 
	 TreeSet<String> allBrands = new TreeSet<>(brands);// inside our TreeSet we can add Collection
	 
	 allBrands.add("Calvin Klein");
	 allBrands.add("Michael Kors");
	 allBrands.addAll(luxBrands); // we can add elements from other collection
	 
	 
	 System.out.println(allBrands); // will be implementing on ascending order
	 
	 Iterator<String> iterator = allBrands.iterator();// which collection we would like to iterate
	 while(iterator.hasNext()) {
		String itBrand = iterator.next();
			System.out.println(itBrand);
		}
	 
	 System.out.println(" Creating an object of TreeSet to store DOUBLE---------");

	 Set<Double> tset = new TreeSet<>();
	 tset.add(10.99);
	 tset.add(1.99);
	 tset.add(12.99);
	 tset.add(109.99);
	 tset.add(110.99);
	 tset.add(280.99);
	 System.out.println(tset);
	 
	 }

	 
	 
	 
	 
}
	
	
