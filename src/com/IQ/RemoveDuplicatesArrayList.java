package com.IQ;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesArrayList {
	
	/*
	 * remove all duplicates from ArrayList?
	 */

	public static void main(String[] args) {
		
		
		ArrayList<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
//		// 1 way
//		HashSet<String> set = new HashSet<>(aList);
//		System.out.println(set);
		
		// 2 way
		HashSet <String> hset = new HashSet<>();
		for (String name : aList) {
		hset.add(name);
		}
		System.out.println(hset);

		
	}

}
