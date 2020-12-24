package com.review.class24;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.salary = 90000;
		emp.getPaid();
		
		Contractor ct = new Contractor();
		ct.hourlyRate = 50;
		ct.getPaid();// overriding method fom child class will get executed
		
		FullTimeEmployee ft = new FullTimeEmployee();
		ft.salary = 95000;
		ft.getPaid(); // parent method getPaid es executed
		
	}

}
