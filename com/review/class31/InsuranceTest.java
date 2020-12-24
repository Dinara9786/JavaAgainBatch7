package com.review.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {

		ArrayList<Insurance01> array =new ArrayList<>();
		
		array.add(new Car01 ("Toyota", "Cigna"));
		array.add(new Pet01 ("Dog", "Fideliz"));
		array.add(new Health01 ("Healthcare"));
		
		for (Insurance01 ins:array) {
			ins.cancelInsurance();
			ins.getQuote();
		}
		
		System.out.println("===Regular loop ==============");
		for (int i=0; i<array.size(); i++) {
			array.get(i).getQuote();
			array.get(i).cancelInsurance();
		}
		
		Iterator <Insurance01> insurance = array.iterator();
		while(insurance.hasNext()) {
		Insurance01 insure = insurance.next();
			insure.getQuote();
			insure.cancelInsurance();
			
			
		}
		
		System.out.println("===========Creating objects============");
		Car01 c = new Car01 ("Mazada", "Geico");
		c.getQuote();
		c.cancelInsurance();
		
		Pet01 p = new Pet01 ("Doggy", "maico");
		p.getQuote();
		p.cancelInsurance();
		
		Health01 h = new Health01 ("Health");
		h.getQuote();
		h.cancelInsurance();
	}

}
