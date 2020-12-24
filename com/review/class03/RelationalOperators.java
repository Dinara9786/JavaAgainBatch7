package com.review.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		int a = 7; 
		int b = 10;
		System.out.println(3>4);// false
		System.out.println(a>b); // false
		System.out.println(a<b);
		System.out.println(a==b); // this is comparison = equals
		System.out.println(a!=b); // a is not equal to b 
		
		System.out.println("============================");
		
		double i = 10.78; 
		double j = 10.55;
		
		boolean result1 = i<j;
		System.out.println(result1);
		
		boolean result2 = i==j;
		System.out.println(result2);
		
		boolean result3 = (i!=j); 
		System.out.println(result3);
		
		boolean result4 = i>=j; // is I equal or greater than j
		System.out.println(result4);
		
		boolean result5 = i<=j; // is I equal or smaller than j
		System.out.println(result5);
		
		// comparison operators = <, >, =<, >=, !=
		
		
	}

}
