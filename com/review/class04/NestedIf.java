package com.review.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean isMorning = false;
		boolean isSchool = false;
		int time = 23;
		
		if (isMorning) {
			System.out.println("Good Morning!");
			
			if (isSchool) {
			System.out.println("Friends");
			} else {
			System.out.println("Family");
		}  
			System.out.println("Bye");
	}else {
		System.out.println("It is not morning");
		
		if (time < 19) {
			System.out.println("It is afternoon");
		} else {
			System.out.println("Good evening");	
		}
	}
	System.out.println("Victoriia has no questions");
	}
	}


