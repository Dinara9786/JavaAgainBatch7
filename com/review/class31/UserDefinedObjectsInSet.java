package com.review.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedObjectsInSet {

	public static void main(String[] args) {

		// we need to store object of Health, Pet, Car
		Set<Insurance> lset = new LinkedHashSet<>();

		lset.add(new Pet("Cat", "Cigna"));
		lset.add(new Car("Tesla", "Geico"));
		lset.add(new Health("Blue Cross Blue Shield"));

		// how to access variables adn methods?

		for (Insurance ins : lset) {
			System.out.println(ins.insuranceName); // accessing variables

			// calling methods
			ins.cancelInsurance();
			ins.getQuote();
			System.out.println("===========================");
		}

		System.out.println("====Using Iterator to call all the elements in the Collection");

		Iterator<Insurance> it = lset.iterator();
		while (it.hasNext()) {
			Insurance i = it.next();
			
			//accessing variables
			System.out.println(i.insuranceName);
			i.cancelInsurance();
			i.getQuote();
			System.out.println("=======================================");
		}

	}

}
