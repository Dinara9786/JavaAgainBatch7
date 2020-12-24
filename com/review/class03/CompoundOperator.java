package com.review.class03;

public class CompoundOperator {
	
	public static void main(String[] args) {
		
	int num = 100;
	num = num + 100;// 200
	System.out.println(num);
	
	// we can use compound operator which is short
	num +=100;// num = num+100
	System.out.println(num);
	
	num-=100;// num is a container, is a variable
	System.out.println(num);
	num%=3; // num = num%3
	System.out.println(num);
	
	System.out.println("========TASK=================");
	
	int k1 = 2; 
	k1+=100; 
	System.out.println(k1);
	
	double k2 = 13; 
	k2-=67;
	System.out.println(k2);
	
	double cakePiece = 11;
	cakePiece/=4;
	System.out.println(cakePiece);
	
	int cakePiece1 = 25;
	cakePiece1%=7;
	System.out.println(cakePiece1);
	
	
	
	
	
	

	}

}
