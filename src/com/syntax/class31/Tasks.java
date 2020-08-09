package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Create a Set collection in which you need to add names of the countries. 
 * In this set we want all objects to be sorted in alphabetical order. 
 * Using 2 different ways retrieve all elements from set.
 * 
Create a Set of cities in which you want to make sure that insertion order is maintained. 
Using Iterator remove any city that starts with “A”;

 */
public class Tasks {
public static void main(String[] args) {
	System.out.println("------------Task1-----------------------");
	
	Set<String> countries= new TreeSet<>();
	countries.add("Moldova");
	countries.add("Russia");
	countries.add("USA");
	countries.add("Argentina");
	
	System.out.println("----------using enhanced for loop--------------");
	for(String c:countries) {
		System.out.print(c + " ");
	}
	System.out.println();
	System.out.println("----------using Iterator--------------");
	
	Iterator<String> it = countries.iterator();
	while(it.hasNext()) {
		System.out.print(it.next() + " ");
	}
	System.out.println();
	
	System.out.println("------------Task2-----------------------");
	
	Set<String> cities = new HashSet<>();
	cities.add("Morocco");
	cities.add("Bucharest");
	cities.add("Chisinau");
	cities.add("Paris");
	cities.add("Alma-Ata");
	
System.out.println("----------using Iterator--------------");
	
	Iterator<String> iter = cities.iterator();
	while(iter.hasNext()) {
		String s =iter.next();
		if(s.startsWith("A")) {
			iter.remove();
		}else {
			System.out.print(s + " ");
		}
	}

}
}
