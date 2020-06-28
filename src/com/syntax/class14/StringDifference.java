package com.syntax.class14;

public class StringDifference {

	public static void main(String[] args) {
		String name = "Madeeha";
		String name1 = new String("Madeeha");
		//name1 = "Madeeha";      //if strings are created in 2 different ways it can work ==

		
		System.out.println(name);
		System.out.println(name1);
		
		if(name.equals(name1)) {
			System.out.println("Strings are equal using equals method");
		}
		if (name == name1) {
			System.out.println("Stringsa re equal using == operator");
		}
		String name2 = "Madeeha";     //if strings a re created the same way == wont work needed .equals()
		if (name1 == name2) {
			System.out.println("2 Strings are equal");
		}
	}
}
