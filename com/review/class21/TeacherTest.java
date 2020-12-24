package com.review.class21;

public class TeacherTest {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		
		teacher.address = "New York";
		Teacher.school = "Stony Brook";
		teacher.credits = 22;
		teacher.subject = "Algebra";
		
		teacher.study();
		teacher.attend();
		
		Students students = new Students();
		students.address = "Los Angeles";
		Students.school = "Harvard";
		students.subject = "Computer Science";
		students.credits = 25;
		students.specialization = "IT Security";
		students.performance = true;
		
		students.study();
		students.attend();
		students.communicate();
		
		Volunteer vol = new Volunteer();
		
		vol.address = "Boston";
		vol.school = "Standford";
		vol.credits = 57;
		vol.subject = "SDET";
		vol.enthusiasm = "strong";
		vol.experience = 23;
		vol.performance = true;
		
		vol.study();
		vol.help();
		vol.attend();
		vol.communicate();
		
	}

}
