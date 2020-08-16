package com.class24.MethodOverriding_Polymorphism;

public class MainOverload {
	public static void main(String str) {
		System.out.println("I am a main method with String");
		
	}
	
	public static void main(String str, int num) {
		System.out.println("I am a main method with 2 parameters");
		
	}
	
	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
		main("main");
	}
}
