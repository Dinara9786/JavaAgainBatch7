package com.review.class21;

public class Book {
	
	String pen;
	String pencil;
	int pages;
	
	public Book () {
		
		System.out.println("I am non-parameterized constructor");
			
	}
	
	public Book (String pen, String pencil, int pages) {
		this();
		this.pen = pen;	
		this.pencil = pencil; 
		this.pages = pages;
	}
	
	public void displayInfo() {
		System.out.println("The pen is " + pen + " the pencil is " + pencil + "and the number of pages is " + pages);
		
	}
	
	public static void main(String[] args) {
		
		Book obj = new Book("red", "white", 600);
		obj.displayInfo();
		
		
	}
		

}
