package com.review.class14;

public class Student {

	String name, lastName, school;
	char grade;
	int studID;

	void study() {
		System.out.println("Student " + name + " having grade " + grade + " should study hard");
	}

	void doHomework() {
		System.out.println("Student with student ID " + studID + " should do homework");
	}

	public static void main(String[] args) {

		Student student = new Student();

		student.name = "Alla";
		student.lastName = "Smith";
		student.grade = 'A';
		student.school = "Syntax";
		student.studID = 123;
		student.study();
		student.doHomework();
		
		System.out.println();
		System.out.println("======Object of another student=======");
		
		Student student2 = new Student();

		student2.name = "JOhn";
		student2.lastName = "Doe";
		student2.grade = 'B';
		student2.school = "Ermex";
		student2.studID = 333;
		student2.study();
		student2.doHomework();
		
		
	}

}
