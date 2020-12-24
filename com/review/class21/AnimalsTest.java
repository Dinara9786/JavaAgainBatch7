package com.review.class21;

public class AnimalsTest {
	
	public static void main(String[] args) {
		
		//object of parent class has an access to all variables and methods of it is own class only
		Animal a = new Animal();
		a.breed = "Something";
		a.color = "grey";
		a.paws = 4;
		
		a.eat();
		a.sleep();
		
		Dog dog = new Dog(); // object of child class has an access to all variables and methods of
		dog.breed = "Husky";
		dog.color = "Yellow";
		dog.paws = 4;
		dog.tail = true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		Cat cat = new Cat();
		cat.breed = "";
		cat.color = "";
		cat.paws = 4;
		cat.tail = true;
		cat.fur = "brown";
		
		cat.eat();
		cat.sleep();
		cat.purr();
		
		
		
		
		
		
		
	}
	

}
