package com.class21.Inheritance;

public class Book {
/*
 * Write program as a Book class   that will have instance variables and 2 Constructors.
 *  While creating an object make sure:Instance variables are being initialized
    Both Constructors are being executed
 */
	String name;
	int age;
	
	Book(int age){
		this("Sorina");   
		System.out.println("I am "+ age + " years old");
	}
	
	Book(String name){
		System.out.println("My name is "+ name);
	}
	
	public static void main(String[] args) {
		Book b = new Book(32);
	}
}
