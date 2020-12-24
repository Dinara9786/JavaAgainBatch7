package com.review.class32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {

		Map<String, Double> employees = new LinkedHashMap<>();

		employees.put("John Smith", 1000000.0);
		employees.put("Dinara Rysalieva", 9000000.0);
		employees.put("Akerke Tungatarova", 8000000.0);
		employees.put("Doolot Tungatarov", 7000000.0);
		employees.put("Kylychbek Rysaliev", 5000000.0);

		Collection<Double> values = employees.values();
		
		double max = 0;

		for (double value : values) {
			if (value > max) {
				max = value;
			}
		}
		System.out.println(max);

		Set<Entry<String, Double>> allEntries = employees.entrySet();

		for (Entry<String, Double> entry : allEntries) {
			if (entry.getValue() == max) {
				System.out.println(entry.getKey() + "=$" + entry.getValue());
			}
		}
		
		
		System.out.println("==========Another way============");
		
		Map<String, Double> employ = new LinkedHashMap<>();

		employees.put("DSR", 11000000.0);
		employees.put("AT", 90200000.0);
		employees.put("DT", 80000007.0);
		employees.put("KR", 70000050.0);
		employees.put("YR", 50000030.0);
		
		Set<Entry<String, Double>> entry = employ.entrySet();
		
		double largest = 0; 
		String name = " ";
		
		for (Entry<String, Double> emp : entry) {
			if (emp.getValue()>largest) {
				largest = emp.getValue();
				name = emp.getKey();
			}
		}
		System.out.println(name + " =$" + largest);
		
		}

	}


