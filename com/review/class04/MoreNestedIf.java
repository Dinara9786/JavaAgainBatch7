package com.review.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		// let us have a date of month and day of week
		// if it is Friday -- >
		// if it is 13, -->   watch a scary movie
		// else -- > watch a comedy
		
		
		boolean isFriday = true;
		int date = 17; 
		
		if (isFriday) {
			System.out.println("We are watching movie");
			if (date ==13) {
				System.out.println("Watch a scary movie");
			} else {
				System.out.println("Watch a comedy");
			}
		}else {
			System.out.println("Study java hard");
		}
			
			}
		} 
		
	
	

