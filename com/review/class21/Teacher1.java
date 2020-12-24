package com.review.class21;

public class Teacher1 {
	
	static String school;
	String name;
	boolean performance;
	int experience;
	
	void access() {
		
		System.out.println(name + " should have access to all " + school + " rooms");
	}
	
	void assess () {
		
		System.out.println(name + " with experience of "  + experience + " years" + " can assess the performance of students");
	}

}

