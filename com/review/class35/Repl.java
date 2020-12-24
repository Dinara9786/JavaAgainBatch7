package com.review.class35;

import java.util.ArrayList;
import java.util.Iterator;

public class Repl {
	
	public static void main(String[] args) {
		
		ArrayList<Boolean> ListA = new ArrayList<>();
		
		ListA.add(true);
		ListA.add(false);
		ListA.add(false);
		
		ArrayList<Boolean> ListB = new ArrayList<>();
		
		ListB.addAll(ListA);
		System.out.println(ListB);
		
		Iterator<Boolean> listC = ListA.iterator();
		
		while(listC.hasNext()) {
			System.out.println(listC.next());
		}
		
		
	}

}
