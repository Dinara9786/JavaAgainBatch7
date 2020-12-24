package com.review.class25;

class Human {
	
	public void happy() {
		System.out.println("Humans are happy");
	}
	
	public void study () {
		System.out.println("Human should study and study");
	}
	
}
public class Student extends Human{

	public void attend() {
		System.out.println("Students attend the classes");
	}

	public void study() {
		System.out.println("Students should study hard");
	}
}

class SyntaxStudent extends Student {
	

	public void attend() {
		System.out.println("Syntax Students attend classes 5 times a week");

	}

	public void studyIT() {
		System.out.println("Syntax Students study IT");
	}
	
	public void loveJava() {
		System.out.println("Syntax Students love Java");
	}
}
	class CollegeStudent extends Student {

		public void read() {

			System.out.println("College Students read books");
		}
	}

	class SchoolStudent extends Student {
		
		public void study() {
			System.out.println("School Students study many subjects in school");
		}

	}
	

	
