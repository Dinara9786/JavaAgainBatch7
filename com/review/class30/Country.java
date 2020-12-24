package com.review.class30;

public abstract class Country {

	public String name; // instance varialbe

	public Country(String name) {
		this.name = name;

	}

	public abstract void election();

}

class USA extends Country {

	public USA (String name) {
		super(name);
	}

	public void election() {
		System.out.println(name + " holds presentail electoin eveyr 4 years");
	}

}

class Kazakhstan extends Country {

	public Kazakhstan(String name) {
		super(name);

	}

	public void election() {
		System.out.println(name + " holds elections whenever they decides so");
	}
}

class Afghanistan extends Country {

	public Afghanistan(String name) {
		super(name);
	}

	public void election() {
		System.out.println(name + " holds election every 5 years");
	}
}
