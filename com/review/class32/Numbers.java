package com.review.class32;

import java.util.ArrayList;
import java.util.Collection;

public class Numbers {
	public static void main(String[] args) {
		
	
	Collection <Integer> numbers = new ArrayList<>();
	
	numbers.add(100); 
	numbers.add(200); 
	numbers.add(500); 
	numbers.add(1100); 
	numbers.add(1020); 
	numbers.add(1007); 
	numbers.add(10017); 
	 
	int sum = 0;
	
	for (Integer number: numbers) {
		sum+=number;
	}
	System.out.println("Sum of numbers is = " + sum);
	
	
	

}
}