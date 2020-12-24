package com.review.class32;

public class Person {

	String name, lastName;
	int age;
	double salary;

	Person(String name, String lastName, int age, double salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;

	}

	public void prinInfo() {
		System.out.println(name + " " + lastName + " " + age + " " + salary);
	}

}
