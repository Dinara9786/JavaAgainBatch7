package com.review.class21;

public class Constructors {
	
	String word;
	
	public Constructors () {
		System.out.println("I am a non-argument constructor");
	}
	
	public Constructors (String word) {
		this(12, word); // this = always refers to the current class // IF NEED TO MAKE A CALL IT ALWAYS MUST BE A FIRST STATEMENT INSIDE THE CONSTRUCTOR
		this.word = word;// initializing our variable
		System.out.println("I am a parameterized constructor with str =" + word);
		//this(); CE: BECAUSE THIS MUST BE A FIRST LINE
		
	}
	
	Constructors (int num) {
		System.out.println("I am constructor with 1 parameter = "  +num);
	}
	
	Constructors (int num, String word) {
		System.out.println("I am constructor with 2 parameter - " + num+ " and " + word);
	}
	public static void main(String[] args) {
		
		Constructors obj = new Constructors("Java");
		System.out.println(obj.word);
		
	}
	
	void hello () {
		
}
}

