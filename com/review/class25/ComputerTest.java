package com.review.class25;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer apple = new Apple("Apple", 24, "New York");
		Computer lenovo = new Lenovo("Lenovo", 13);
		Computer hp = new HP("HP", 22);
		Computer dell = new Dell("Dell", 12);
		
		
		Computer [] computers = {apple, lenovo, hp, dell};
		int size = computers.length;
		System.out.println(size);
		
		for (Computer comp : computers) {
			comp.playMusic();
			comp.sound();
		}
		
		System.out.println("========REGULAR LOOP===================");
		Computer [] comps = {new Apple ("Apple", 24, "Seattle"), new Lenovo("Lenovo", 48), 
				new HP("HP", 16), new Dell("Dell", 17)};
		
		for (int i= 0; i<comps.length; i++) {
			comps[i].sound();
			comps[i].playMusic();
			
		}
	}

}
