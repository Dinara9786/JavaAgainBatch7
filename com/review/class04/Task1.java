package com.review.class04;

public abstract class Task1 {
	
public static void main(String[] args) {
	
	boolean diploma = false;
	double gpa = 3.9;
	
	if (!diploma) {
		System.out.println("Congratulations");
		if (gpa >=3.5) {
			System.out.println("You are eligible for scholarship");
		} else {
			System.out.println("You should have studied harder");
		}
	} else { 
		System.out.println("You should get a degree");
	}
}

}
