package com.review.class32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Map <Integer, Person> person = new TreeMap<>();
		
		person.put(9786, new Person ("Dinara", "Rysalieva", 50, 10045000.00));
		person.put(7874, new Person ("Akerke", "Tungatarova", 15, 1500000.00));
		person.put(2248, new Person ("Doolotkeldi", "Tungatarov", 18, 1200000.00));
		person.put(1126, new Person ("Kuntegin", "Kylychbek", 7, 10012000.00));
		person.put(1127, new Person ("Kylychbek", "Rysaliev", 45, 11001000.00));
		
		Set<Integer> keys = person.keySet();
		
		System.out.println("=======retrieving with loop=========");
		
		for (Integer key:keys) {
			System.out.println("The person's ID is = " + key);
			person.get(key).prinInfo();
			System.out.println("=================");
		}
		
		System.out.println("=======retrieving with EntrySet with Iterator=========");
		
		Set <Entry<Integer, Person>> persona = person.entrySet();
		
		Iterator <Entry<Integer, Person>> persons = persona.iterator();
		while (persons.hasNext()) {
			Entry<Integer, Person> entry = persons.next();
			int id = entry.getKey();
			Person pers = entry.getValue();
			pers.prinInfo();
			System.out.println("Person'sID is = " + id + "  ");
			System.out.println("============");
		}
		
	}

}
