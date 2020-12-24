package com.review.class21;

public class Student {
	
	String name, address;
	
	public Student (String name, String address) {
		this.name = name; 
		this.address = address;
				
	}
	
	void display () {
		System.out.println("Student's name is " + name + " and student's address is " + address);
	}
	
	public static void main(String[] args) {
		
	
	Student student = new Student ("John", "New York");
	student.display();
			
	}	
}
