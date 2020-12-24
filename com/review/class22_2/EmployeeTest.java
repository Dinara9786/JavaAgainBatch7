package com.review.class22_2;


import com.review.class22.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.companyName = "Google";
		//new ScrumTeam(); is not available because it is default is not visible in another class
		// public is visible
		
		WaterFallTeam wt=new WaterFallTeam();
		WaterFallTeam.companyName = "Amazon";
		//wt.salary = also default is not visible and not available
	
		
		
	}

}
