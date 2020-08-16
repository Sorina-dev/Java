package com.class29.Collections_WrapperClasses;

import java.util.ArrayList; //import it

public class ArrayListIntro {
public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<>();
		//to add values to the arraylist
		arrayList.add("Hello");//0
		arrayList.add("Welcome");//1
		arrayList.add("How are you");//2
		
		System.out.println(" ----------    Original arrayList "+arrayList);
		
		//how many elements inside my ArrayList
		int arrayListSize=arrayList.size();
		System.out.println("Size of original arrayList "+arrayListSize);
		
		//how to access elements from ArrayList
		String elementIndex2=arrayList.get(2);
		System.out.println(elementIndex2);
		
		//I would like to add more Objects into ArrayList
		arrayList.add("Good Bye");
		arrayList.add("Thank you");
		
		System.out.println("Size of Arraylist after adding more String Objects = "+arrayList.size());
		System.out.println(" ----------    Arraylist after adding more String Objects "+arrayList);
		
		//Let's remove "Hello";
		arrayList.remove(0);
		
		System.out.println("size of arraylist after removing Object "+arrayList.size());
		System.out.println(" ----------    Arraylist after removing Object "+arrayList);
		
		//I want to update value "Good Bye" --> "Bye"
		arrayList.set(2, "Bye");
		System.out.println(" ----------    Arraylist after replacing Object "+arrayList);
	}
}
