package com.syntax.class23;

public class Superclass {
String name="Kamila";
	
	public void printHello(){
		System.out.println("Hello from parent class");
	}
}

class SubClass extends Superclass {
	
	String name="Mina";
	
	public void displayName() {
		System.out.println(this.name); // the instance variable
		System.out.println(super.name);// the instance from parent class 
	}
	
	public void printHello() { //overrides from parent class method
		System.out.println("Hello from child class");
	}
	
	public void callingParentMethod() {
		//printHello();//this.printHello();
		super.printHello();
	}
}
