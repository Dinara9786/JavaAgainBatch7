package com.review.class03;

public class BooleanIfCondition {
	public static void main(String[] args) {
		
		boolean flag = true;
		
		if (flag) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}
		
		System.out.println(flag);
		
		if (!flag) { // exclamation mark will reverse the condition
			System.out.println("it is not flag");
		}else {
			System.out.println(" It is flag");
		}
	}

}
