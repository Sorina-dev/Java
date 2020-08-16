package com.class21.Inheritance;

public class Student {

	/*
	 * Write a Student class   that have instance variables name and address. 
	 * Create a constructor that will initialize those variables.
	 *  Print name & address of given  student using displayInfo method.
	 */
	String name, address;
	
	Student(String name, String address){
		this.name = name;
		this.address = address;
	}
	void displayInfo() {
		System.out.println("Student's name is "+name + ", who lives on "+ address + " street");
	}
	
	public static void main(String[] args) {
		Student s = new Student("Maria", "Dacia");
		s.displayInfo();
	}
}
