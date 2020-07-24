package com.syntax.Reviewclass09;

public class School {
	String name, lastName;
	int age, weight, height;
	static String schoolName;
	
	public School(String name, String lastName) {
		this.name=name;
		this.lastName=lastName;
	}
	
	
	public School(String name, String lastName, int age) {
		this(name, lastName);
		this.age=age;
	}
	
	public School(String name, String lastName, int age, int weight, int height) {
		this(name, lastName, age);
		this.weight=weight;
		this.height=height;
	}
	
	
	public void printDetails() {
		System.out.println("Name : "+name);
		System.out.println("Lastname : "+lastName);
	}
	
	// 1. We overloaded constructers by changing the number variables
	// 2. We invoked a constucter inside another constructer

}
