package com.review.class13;

import java.util.LinkedList;

public class Fibonacci {
	public static void main(String[] args) {
		
			   LinkedList<Integer>integers=new LinkedList<>();
			        Integer num1=0;
			        Integer count=10;
			        Integer num2=1;
			        for(int i=0;i<count;i++){
			            integers.add(num1);
			            Integer sum=num1+num2;
			            num1=num2;
			            num2=sum;
			        }
			        System.out.println(integers);
			 }
	
}

	