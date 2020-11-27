package com.class30.Recap_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> food = new LinkedList<>();
		food.add("beshparmak");
		food.add("pizza");
		food.add("biryani");
		food.add("tacos");

		String myFood = food.get(2);
		System.out.println(myFood);

		LinkedList<String> deserts = new LinkedList<>();
		deserts.add("cake");
		deserts.add("ice cream");
		deserts.add("cookies");

		food.addAll(deserts);
		System.out.println("LinkedList after adding another collection = " + food);

		food.remove("pizza");
		System.out.println("LinkedList after removing element = " + food);

		food.set(3, "brownie");
		System.out.println("LinkedList after replacing element = " + food);

		// I want to get all values 1 by 1
		Iterator<String> foodIterator = food.iterator();
		while(foodIterator.hasNext()) {
			String fooood=foodIterator.next();
			System.out.print(fooood+"  ");
			if(fooood.equals("cookies") || fooood.equals("brownie")) {
				foodIterator.remove();
			}
		}
		
		System.out.println();
		System.out.println("LinkedList after Iterator ="+food);
		
		//lets create list with Country type of objects
		LinkedList<Country> countries=new LinkedList<>();
		countries.add(new USA("USA"));
		countries.add(new Kazakhstan("Kazakhstan"));
		countries.add(new Afghanistan("Afghanistan"));
		
		System.out.println("Collection of Country Objects has "+countries.size()+" elements");
		
		for(Country c: countries) {
			c.election(); // call the method
		}
		
		//creating an Object of LinkedList and storing inside List type of variable
		List<String> webelements=new LinkedList<>();
		webelements.add("Link");
		webelements.add("radio button");
		webelements.add("checkbox");
		
	}
}
