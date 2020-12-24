package com.review.class29;

import java.util.ArrayList;

public class ArrayListInto {

	public static void main(String[] args) {
		
		ArrayList <String >arrayList = new ArrayList<>();
		// to add values to the arrayList to call method add.
		arrayList.add("Hello");//0
		arrayList.add("Welcome");//1
		arrayList.add("How are you");//2
		
		System.out.println("Original arrayList = " + arrayList);
		
		// elements are stored based on the index.
		
		// how many elements inside my ArrayList
		int arrayListSize = arrayList.size(); // we are calling the method .size();
		System.out.println("Size of original arrayList " + arrayListSize);
		
		// how to access elements from ArrayList
		String elementIndex2 = arrayList.get(2); // we are accessing to element of index 2 = "How are you"
		System.out.println(elementIndex2);
		
		// I would like to add more objects to my ArrayList
		
		arrayList.add("Good bye");
		arrayList.add("Thank you");
		
		System.out.println("Size of ArrayList after adding more String Objects " +arrayList.size());
		
		//ArrayList is global array. All of objects of our collections are global and not fixed in size. 
		
		// I would like to remove "Hello" = index (0)
		arrayList.remove(0);
		
		System.out.println("Size of ArrayList after removing Object Hello " + arrayList.size());
	
		// I want to update the value from "Good bye" to "bye", we are using method .set()
	
		arrayList.set(2, "Bye");
		System.out.println(" Array List after replacing =" + arrayList);
	
	
	
		
		
		
		
		
		
		
	}

}
