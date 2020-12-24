package com.review.class29;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		// let us create an ArrayList that will store numbers
		
		// inside <> we need to specify type, what kind of object we would like to store. Inside collections 
		// we cannot store primitive type, but we can store wrapper class =  
		ArrayList <Integer> alist = new ArrayList<>(); 
		alist.add(100);
		alist.add(200);
		alist.add(300);
		//alist.add("400"); // we cannot store String objects into ArralList of Integer Objects
		
		System.out.println("Size of alist is = " + alist.size());
		System.out.println(alist);// we are printing elements
		
		alist.add(1);
		alist.add(2);
		alist.add(2);
		alist.add(2);
		
		System.out.println("alist after adding more elements is = " + alist);
		
		alist.remove(2);// specifying index 
		System.out.println("alist after removing index 3 is = " + alist);
		
		
		
		
	}

}
