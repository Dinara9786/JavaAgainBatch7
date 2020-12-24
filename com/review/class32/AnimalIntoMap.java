package com.review.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalIntoMap {

	public static void main(String[] args) {

		Map<Integer, Animal> life = new LinkedHashMap<>(); // Animal type

		life.put(1, new Dog("Dog", "Grey"));
		life.put(2, new Monkey("Monkey", "Brown"));
		life.put(3, new Zebra("Zebra", "Black and White"));

		System.out.println("========= Access all variables and call all available methods of Animals ===============");

		Set<Entry<Integer, Animal>> entries = life.entrySet();
		for (Entry<Integer, Animal> e : entries) {

			Animal animal = e.getValue();
			animal.eat();
			animal.sleep();
			System.out.println("==========");

		}

		System.out.println("============USING ITERATOR TO RETRIEVE ENTRY+++++++++++++++++++++");
		System.out.println();
		
		Iterator<Entry<Integer, Animal>> ent = entries.iterator();
		while(ent.hasNext()) {
			Entry<Integer, Animal> en = ent.next();
			Integer key = en.getKey();
			Animal va = en.getValue();
			System.out.println(va.color);
			System.out.println(va.type);
			va.eat();
			va.sleep();
			System.out.println("===================");
			
		}
		
		

		System.out.println("=========USING Values===============");

		Collection<Animal> values = life.values();
		for (Animal val : values) {
			System.out.println(val.type);
			System.out.println(val.color);
			val.eat();
			val.sleep();
			System.out.println("===============");

		}

		System.out.println("=========USING keySet===============");
		System.out.println();

		Set <Integer>keys = life.keySet();
		
		for (Integer key : keys) {
			Animal animal = life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("=============================");
		}
		
	}

}
