package com.review.class25;

public class TestClass {
	
	public static void main(String[] args) {
		
		SuperClass c = new SubClass();
		c.enjoy(); // IF STATIC METHOD THEN WE CANNOT OVERRIDE STATIC METHODS AND JAVA EXECUTES PARENT'S CLASS METHOD 
		//STATIC ALWAYS BELONGS TO THE CLASS (STATIC)
		
		SuperClass.enjoy();// method that belongs to SuperClass
		SubClass.enjoy(); // method that belongs to SubClass
		
	}

}
