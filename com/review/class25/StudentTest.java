package com.review.class25;

public class StudentTest {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("=====Creating an object of SyntaxStudent==============");
		
		SyntaxStudent st = new SyntaxStudent();
		st.attend(); // we will execute our own methods
		st.studyIT();
		st.loveJava();
		st.study();
		
		System.out.println();
		System.out.println("=====Creating an object of CollegeStudent==============");
		System.out.println();
		CollegeStudent college = new CollegeStudent();
		college.attend();
		college.read();
		college.study();
		
		System.out.println();
		System.out.println("=====Creating an object of Student==============");
		System.out.println();
		Student student = new Student();
		student.attend();
		student.study();

		System.out.println();
		System.out.println("=====Creating an object of College Student but give reference to Parent class = Student class==============");
		System.out.println();
		
		Student obj = new CollegeStudent(); // upcasting
		obj.attend(); 
		obj.study();
		
		System.out.println();
		System.out.println("=====Creating an object of Student Student but give reference to Parent class = Student class==============");
		System.out.println();
		
		Student ss = new SyntaxStudent();
		ss.study(); // it is runtime polymorshism 
		ss.attend();//it is runtime polymorshism 
		
		System.out.println();
		System.out.println("=====Creating an object of School Student but give reference to Grand Parent class = Human class==============");
		System.out.println();
		
		Human school = new SchoolStudent();
		school.happy(); // compiler will always look at your object and will run object implmenetation
		school.study();
		
	}

}
