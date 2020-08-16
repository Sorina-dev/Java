package com.class32.Entry_Map;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * Create the collection that will store single uniques Objects of a String type in which order
 *  is preserved.
Write a logic to concatenate all string from the collection.
 */
public class CollectionAndConcatenateStrings {
public static void main(String[] args) {
	
	Set<String> unique = new LinkedHashSet<>();
	unique.add("London");
	unique.add("Barcelona");
	unique.add("Miami");
	unique.add("Riga");
	
	System.out.println(unique);
	
	Iterator<String> it = unique.iterator();
	String newS = "";
	while(it.hasNext()) {
		String s = it.next();
		newS += s;
		
	}
	System.out.print("The concatenated String is "+newS);
	System.out.println();
	/*
	 * Create a collection of integers in which you can keep duplicates. 
Write a logic to find sum of all integers
	 */
	
	List<Integer> numbers = new LinkedList<>();
	numbers.add(1);
	numbers.add(4);
	numbers.add(4);
	numbers.add(8);
	
	System.out.println(numbers);
	
	int sum = 0;
	for(Integer n :numbers) {
		sum += n;
	}
	System.out.println("The sum of numbers is "+sum);
}
	
}
