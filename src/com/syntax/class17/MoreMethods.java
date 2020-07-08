package com.syntax.class17;

public class MoreMethods {
	//create a method that should return the largest number from an array
	int largestFromArray (int[] array) {
		
		int largest = array[0]; // we supposed to be it
				
		for (int i = 1; i < array.length; i++) {// the index next as not need to compare to the same index 0)		
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}
	//create a method that will accept a String and return words from that string
		//Hello World, Good night friends
	String[] getWords(String str) {
		return str.split(" ");
	}
}
