package com.review.class13;

import java.util.LinkedList;

public class Prime {

	public static void main(String[] args) {

		LinkedList<Integer> integers = new LinkedList<>();

		for (int i = 2; i < 101; i++) {

			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				integers.add(i);
			} else if (i == 2 || i == 3 || i == 5 || i == 7) {
				integers.add(i);
			}
		}
		System.out.println(integers);
	}
}
