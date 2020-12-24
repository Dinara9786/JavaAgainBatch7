package com.review.class22_2;

import com.review.class22.Employee;

public class WaterFallTeam extends Employee {
	
	public void doSlowWork() {
		
	}
	
	public static void main(String[] args) {
		
		WaterFallTeam wt = new WaterFallTeam();
		WaterFallTeam.companyName = "Instagram";
		wt.fullName = "John Snow"; // the visibility of protected variable is available in difference classes through extends of Parent class
		
		Employee emp = new Employee();
		
		
	}

}
