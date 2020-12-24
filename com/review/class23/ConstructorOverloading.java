package com.review.class23;

public class ConstructorOverloading {

	public ConstructorOverloading() {

		System.out.println("Non-argument constructor");
	}

	public ConstructorOverloading(String str) {

		System.out.println("Constructor with one parameter");
	}

	public ConstructorOverloading(String str, String str1) {

	}

	public ConstructorOverloading(int num) {

	}

}

// when it comes to method Overloading = compiler looks at method signature and do not care return type 