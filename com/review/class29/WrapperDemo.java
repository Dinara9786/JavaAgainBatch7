package com.review.class29;

public class WrapperDemo {
	public static void main(String[] args) {
		
		 int num =10;
				 
		 Integer num1=100; // we converted our primitive type into Object type
		 num1.toString().length();// num1 represents Object of integer type, it happens automatically. We call this process of Autoboxing
		 // num1 is variable referring to Object
		 // we can call any method listed
		 
		String str= num1.toString().concat("hello");
		System.out.println(str);
		System.out.println(str.length());
		
		int stringLength = num1.toString().length();
		System.out.println(stringLength);
		
		Byte b = 10;
		System.out.println(b.MAX_VALUE);
		
		Boolean bool=true;
		
		Character ch ='a';
		Double doub = 10.99; 
		
		 
	}
	
	

}
