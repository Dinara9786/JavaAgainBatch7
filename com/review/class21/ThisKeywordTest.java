package com.review.class21;

public class ThisKeywordTest {
	
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(100, 200);// values of instance variables
		obj.sum(10, 20); // values of local variable
		
		ThisKeyword obj1 = new ThisKeyword();// the output will be 0 because no values passed
		obj1.sum(20,  50);
	}

}
