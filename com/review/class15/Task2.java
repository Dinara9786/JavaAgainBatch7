package com.review.class15;

public class Task2 {
	public static void main(String[] args) {
		
		String str = "gggggg 86868 69*()@@!!";
		
		str = str.replaceAll("[^A-Za-z]", "");
		System.out.println(str.length());
	}

}
