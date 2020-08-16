package com.class24.MethodOverriding_Polymorphism;

public class Parent {
	private void hello() {// private methods do not participate in inheritance => cannot override it
		System.out.println("Hello from parent class");
	}

	protected static void hi() {
		System.out.println("Hi from parent class");
	}
}

class Child extends Parent {

	// creating own private method inside child class
	private void hello() {
		System.out.println("Hello from child class");
	}

	//@Override --> CE: we cannot override static methods
	public static void hi() {
		System.out.println("Hi from the child class");
	}
}
