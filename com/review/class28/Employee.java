package com.review.class28;

public class Employee {
	
	public String fullName, title;
	public String ssn;
	
	// make variables private
	private double salary;
	private int age, empId;
	
	public Employee (String fullName, String title, String ssn) {// we created Constructor only for public variables
		this.fullName = fullName;
		this.title = title;		
		this.ssn = ssn;
		
	}
	
	// create public methods (getters and setters) to give access to private variables
	// for every private variables we need to create getter adn setter
	
	
	// creating GETTERs
	public double getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	// to get access to values, we need to create SETTERs and initialize the variables
	
	public void setSalary(double salary) {
		this.salary= salary;
}
	public void setAge (int age) {
		if (age>16) {
		this.age = age;
		}	
	}
		
		public void setEmpId(int empId) {
			if (empId>0) {
				this.empId=empId;
			}
		}


}
