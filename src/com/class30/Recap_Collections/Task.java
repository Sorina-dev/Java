package com.class30.Recap_Collections;

import java.util.ArrayList;
import java.util.Iterator;



/*
 * Create an arraylist of cars and retrieve all the values using 3 different ways.

Create an arrayList of words. Remove every word that ends with “e”.
 */
public class Task {
public static void main(String[] args) {
	System.out.println("--------------1st task---------------");
	ArrayList<String> cars = new ArrayList<>();
	cars.add("Toyota");
	cars.add("Mercedes");
	cars.add("Audi");
	cars.add("Tesla");
	
	System.out.println("***********Using enhanced for loop************");
	
	for(String i : cars) {
		System.out.print(i + " ");
	}
	System.out.println();
	System.out.println("***********Using for loop************");
	
	for(int i = 0; i< cars.size(); i++) {
		System.out.print(cars.get(i) + " ");
	}
	System.out.println();
	System.out.println("***********Using iterator************");
	Iterator<String> it=cars.iterator();
	while(it.hasNext()) {
		 String car=it.next();
					System.out.print(car +" ");
	}
     System.out.println();
     System.out.println("--------------2nd task---------------");
	ArrayList<String> words = new ArrayList<>();
	words.add("mother");
	words.add("odd");
	words.add("end");
	words.add("final");
	
	Iterator<String> i=words.iterator();

	while(i.hasNext()) {
		 String s=i.next();  // need to be converted in a primitive in order to stay in order not to go to next
		 if(s.contains("e")) {//method on string
			 i.remove();  // method on iterator
		 }
		 		
	}
	System.out.println(words);	
	
}
}
