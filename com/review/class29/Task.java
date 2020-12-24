package com.review.class29;

import java.util.ArrayList;

public class Task {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		// we are storing the values by calling method .add();
		names.add("John");
		names.add("Jane");
		names.add("Maria");
		names.add("Mike");
		names.add("Gloria");
		
		boolean namesIsEmpty = names.isEmpty();
		System.out.println(namesIsEmpty);
		
		boolean nameIsPresent = names.contains("Maria");
		System.out.println(nameIsPresent);
		
		System.out.println(names.size());
		System.out.println(names);
		names.clear();
		System.out.println(names);
		
		ArrayList<String> list = new ArrayList<>();
		
		// we are storing the values by calling method .add();
		list.add("Ahmet");
		list.add("Mary");
		list.add("Jessica");
		list.add("Jack");
		list.add("Meerim");
		
		//names.addAll(list);
		
		list.addAll(names);
		//System.out.println(names);
		System.out.println(list);
		
		list.remove("Jessica");
		System.out.println(list);
		
		ArrayList<String> arrayName = new ArrayList<>(4);
		arrayName.add("Ihor");
		arrayName.add("Ivan");
		arrayName.add("Olga");
		// arrayName.add(10.09) : CE: 
		
		arrayName.addAll(list);
		System.out.println(arrayName);
		
		arrayName.removeAll(list);
		System.out.println(arrayName);// removes all from specified collection
		
		// whenever we create Collection we specify type 
		
		
		//This collection is Generic
		ArrayList<String> myList = new ArrayList<>(list);
		System.out.println(myList);
		
		// before Java 1.5 Collections was not Generic
		
		// This collection is not Generic, but gives the warning to specify the type, but we do not this non Generic
		// this way is not preferrable and we do not use it
		ArrayList alist = new ArrayList();
		alist.add("String");
		alist.add(100);
		alist.add(10.99);
		alist.add('g');
		
		System.out.println("NOn generic ArrayList Collection = " + alist);
	}

}
