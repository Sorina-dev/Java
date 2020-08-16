package com.class32.Entry_Map;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/*
 * Create a Person class with following private fields: name, lastName, age, salary. 
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. 
In that map store personId and a Person Object. Print each object details.
 */
public class Person {
	
	private String name, lastName;
	private int age, salary;
	
	Person(String name, String lastName, int age, int salary){
		this.name = name;
		this.age = age;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	void displayDetails() {
		System.out.println(name + " "+ lastName + " "+ " of age "+ age + " has the salalry of "+ salary);
	}
public static void main(String[] args) {
	int personId;
	String personObj;
	Map<Integer, Person> persons = new TreeMap<>();
	persons.put(20, new Person("Antonio", "Rodrigez", 25, 37000));
	persons.put(21, new Person("Maria","Bat", 25, 278393));
	persons.put(22, new Person("Ana", "Smith", 34, 27263));
	
	Collection<Person> detail=persons.values();
	for(Person pers:detail) {
		pers.displayDetails();
		
}
}
}
