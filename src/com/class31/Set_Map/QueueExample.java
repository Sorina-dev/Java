package com.class31.Set_Map;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(100);
		queue.add(1110);
		queue.add(1);
		queue.add(10);
		
		System.out.println(queue);
		queue.remove(); // removes only one first element;  FiFo--> first in first out
		
		System.out.println(queue);
		
	}
}
