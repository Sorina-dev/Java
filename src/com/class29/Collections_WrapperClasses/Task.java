package com.class29.Collections_WrapperClasses;

import java.util.ArrayList;

/*
 * Create an ArrayList that will store 5 names into it. 
Find out whether the given ArrayList is empty or not? 
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that

 */
public class Task {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>(5);
		names.add("Sorina");
		names.add("Victor");
		names.add("Adrian");
		names.add("Evelina");
		names.add("Natalia");
		
		boolean empty = names.isEmpty();
		System.out.println(empty);
		
		boolean contains = names.contains("Sorina");
		System.out.println(contains);
		
		int size = names.size();
		System.out.println(size);
		
		System.out.println(names);
	}
}
