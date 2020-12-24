package com.review.class25;

public class SoreTest {
	public static void main(String[] args) {
		
	Store macys = new Macys("Macys", "Tyson Virginia");
	Store star = new Starbucks ("Starbucks", "New York");
	Store nike = new Nike ("Nike", "Los Angeles", "Jordan");
	
	Store [] stores = {macys, star, nike}; //  representing in a single variable = stores
	Store [] myStores ={new Macys ("Macys", "Washington"), new Starbucks ("Starbucks", "Texas"), new Nike ("Nike", "San Francisco", "Jordan")};
	int size = stores.length;
	System.out.println(size);
	
	System.out.println("=======FOR EACH LOOP ==============");
	
	//Store is object of store type. this is parent class
	for (Store ss : myStores) {
		ss.openHours();
		ss.sell();
		//ss.sellCoffee // will not be available, because it is not declared in Parent class
		
		System.out.println();
	}
		
		System.out.println("===========LOOPING MY STORES ARRAY ================");
		
		for (int i = 0; i<myStores.length; i++) {
			myStores[i].openHours();
			myStores[i].sell();
			System.out.println("==================");
			
		}
		
	}
	}

