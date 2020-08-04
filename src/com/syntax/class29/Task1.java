package com.syntax.class29;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Ahmet");
		names.add("John");
		names.add("Will");
		names.add("Bruce");
		names.add("Leonardo");
		
		System.out.println(names);
		names.clear();
		System.out.println("names collection after clear "+names);
		
		ArrayList<String>list =new ArrayList<>();
		list.add("Ahmet");
		list.add("Gozde");
		list.add("Kamila");
		list.add("Ihsan");
		list.add("Artur");
		System.out.println(list);
		
		names.addAll(list); //add all other values to another collection
		System.out.println("Names after adding all objects from list collection "+names);
		
		System.out.println("Objects inside list collection "+list);
		
		names.remove("Artur");
		System.out.println("Arralist names after removing Arthur "+names);
		
		ArrayList<String> arrayName = new ArrayList<>(4);
	    arrayName.add("Igor");
	    arrayName.add("Ivan");
	    arrayName.add("Olga");
	   // arrayName.add(10.99); CE: its not a String type
	    
	    names.addAll(arrayName);
	    System.out.println(names);
	    
	    names.removeAll(arrayName);
	    System.out.println(names);
	    
	    //generic collection
	    ArrayList<String> myList=new ArrayList<>(arrayName);
	    System.out.println(myList);
	    
	    //before java 1.5 collections was not Generic
	    //non generic - not prefferrable
	    ArrayList alist=new ArrayList();
	    alist.add("String");
	    alist.add(100);
	    alist.add(10.99);
	    alist.add('c');
	    
	    System.out.println("Non generic ArrayList collection "+alist);
	}
}
