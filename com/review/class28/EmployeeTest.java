package com.review.class28;

public class EmployeeTest {
	public static void main(String[] args) {
	
	Employee emp = new Employee("Dinara", "President","654sdf");
	emp.setSalary(9000);
	double salary = emp.getSalary();
	System.out.println(salary);
	
	emp.setAge(1);
	System.out.println(emp.getAge());
	
	emp.setEmpId(-120);
	System.out.println(emp.getEmpId());
	
}
}
