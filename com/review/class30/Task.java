package com.review.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	public static void main(String[] args) {
		
		// 1. Create an arrayList of cars and retrieve all the values using 3 different ways
		// 2. Create an arrayList of words. Remove every work that ends wth "e"
//		3. Create an arrayList of drinks. If any drionk has letter a or i replace it with water
//		4. Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that ArrayList
		
		
		ArrayList <String> cars = new ArrayList<>();
		cars.add("Toyota");
		cars.add("Tesla");
		cars.add("Chevrolet");
		cars.add("Mazda");
		cars.add("Honda");
		
		for (String car:cars) {
			System.out.print(car + " ");
		}
		System.out.println();
		
		for (int i = 0; i<cars.size(); i++) {
			System.out.print(cars.get(i) + " ");
		}
		System.out.println();
		
		Iterator <String> carIt = cars.iterator();
		while (carIt.hasNext()) {
		String carsIt=carIt.next();
		System.out.print(carsIt + " ");
		
		
	}
	
	}

}
