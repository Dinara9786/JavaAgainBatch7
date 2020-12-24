package com.review.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	public static void main(String[] args) {

		// I need collection that can store double objects and can have duplicates and I
		// would like to maintain the order

		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(10.99);// we are boxing our primitive in object type
		numbers.add(9.99);
		numbers.add(8.99);
		numbers.add(9.99);
		numbers.add(9.99);
		// numbers.add(7); CE: we cannot store INTEGER Objects into ArrayList of DOUBLE
		// Objects

		System.out.println(numbers);
		Double num = numbers.get(2);

		double num2 = numbers.get(1);// unboxing

		for (double number : numbers) {
			System.out.print(number + " ");
		}

		System.out.println("=======printing backwards==========");
		for (int i = numbers.size() - 1; i >= 0; i--) {
			double myNum = numbers.get(i);
			System.out.print(myNum + " ");
		}
		System.out.println();

		Iterator<Double> it = numbers.iterator();
//	next(); = > gets next object
//	hasNext(); = > it checks if there is any next element
//	remove(); => removes element from the collection

		double d = it.next();
		double d1 = it.next();
		System.out.println(d1);

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		Iterator<Double> doubleIt = numbers.iterator();
		while (doubleIt.hasNext()) {
			double element = doubleIt.next();// unboxing
			if (element < 10) {
				doubleIt.remove();// removing element from collection
			}
		}

		System.out.println(numbers);

	}

}
