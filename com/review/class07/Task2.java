package com.review.class07;

public class Task2 {
	
	public static void main(String[] args) {
		
		boolean workDay=true;
		int day = 1;
		
//		while (workDay) {
//			if (day<6) {
//			System.out.println("I need a day off");
//			day++;
//		}else {
//			System.out.println("I do not need a day off any more");
//			workDay = false;
//		
//		}
			System.out.println("======ANOTHER WAY===========");
			while (workDay && day<=6) {
				if (day<6) {
				System.out.println("I need a day off");
			} else {
				System.out.println("I do not need a day off any more");
				workDay = false;
			}
			day++;
		
			}
	}
}
		
		
	


