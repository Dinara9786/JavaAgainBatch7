package com.review.class31;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue <Integer>queue = new PriorityQueue<>();
		
		queue.add(11);
		queue.add(110);
		queue.add(111);
		queue.add(911);
		queue.add(1);
		System.out.println(queue);
		
		queue.remove();
		System.out.println(queue);
	}
	
	

}
