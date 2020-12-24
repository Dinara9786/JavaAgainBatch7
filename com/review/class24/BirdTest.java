package com.review.class24;

public class BirdTest {
	
	public static void main(String[] args) {
		
		Bird bird =new BabyBird();// casting of non-primitive // upcasting ==> object of subclass is referred by a Superclass
		// we take BabyBird and referring to Bird
		//achieving runtime polymorphism
		// during runtime the compiler always executes the method based on the object time (Babybird)
		// we call it here runtime polymorphism because JAVA check what to execute = preference is given to object rype
		
		bird.eat();
		bird.fly();
		bird.sleep();
		//bird.cry();
		
		// when we do upcasting Compiler always refers to parent type
		// during compilation compiler gives an access on reference type = Bird
		
		BabyBird bb = new BabyBird();
		bb.cry();
		bb.eat();
		bb.fly();
		bb.sleep();
		
		
	}

}
