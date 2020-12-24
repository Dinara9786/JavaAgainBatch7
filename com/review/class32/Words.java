package com.review.class32;

import java.util.ArrayList;
import java.util.LinkedList;

public class Words {
	public static void main(String[] args) {
		
		LinkedList <String> words = new LinkedList<>();
		
		words.add("Cup");
		words.add("Glass");
		words.add("Plate");
		words.add("Folk");
		words.add("Spoon");
		
		System.out.println(words);
		
		String allWords = "";
		
		for (String word: words) {
			allWords +=word + " ";
		}
		System.out.println(allWords);
	}
	
	

}
