package com.review.class27;

public abstract class Monkey {
	
	public void jumps () {// 0% abstraction
		System.out.println("Monkey jumps");
	}
}

abstract class Mouse {// 50% abstraction
	public void run() {
		System.out.println("All mouses run");
	}
	
	public abstract void eat();

}

abstract class Human { // 100% abstraction
	public abstract void eat();
	public abstract void work();
	public abstract void sleep();
	
	
}
