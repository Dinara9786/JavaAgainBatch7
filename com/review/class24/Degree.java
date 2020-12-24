package com.review.class24;

public class Degree {
	
	public Degree() {
	}
	public void getPrerequisite () {
		System.out.println("To get a degree you need high school diploma");
	}

}

class Bachelors extends Degree {
	public Bachelors() {
	}
}

class Masters extends Degree {
	
	public Masters() {
}
public void getPrerequisite () {
	System.out.println("To get Master's degree you need to get Bachelors' degree first");
	
}
}


