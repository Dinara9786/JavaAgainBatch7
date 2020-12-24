package com.review.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskWords {
	public static void main(String[] args) {

		// // 2. Create an arrayList of words. Remove every work that ends wth "e"

		ArrayList<String> words = new ArrayList<>();
		words.add("sun");
		words.add("moon");
		words.add("planet");
		words.add("America");
		words.add("Guatemala");

		Iterator<String> wordIt = words.iterator();
		while (wordIt.hasNext()) {
			String word = wordIt.next();
			if (word.contains("e")) {
				wordIt.remove();

			}
		}
		System.out.print(words + " ");
		System.out.println();

		ArrayList<Integer> even = new ArrayList<>();

		even.add(10);
		even.add(28);
		even.add(18);
		even.add(40);
		even.add(44);

		Iterator<Integer> evenIt = even.iterator();
		while (evenIt.hasNext()) {
			int even1 = evenIt.next();
			if (even1 / 5 == 0) {
				evenIt.remove();

			}
		}
		System.out.println(even);

	}

}
