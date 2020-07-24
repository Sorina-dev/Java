package com.syntax.Reviewclass09;

public class Math {
	// How to achieve method overloading
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	// 1. by changing the number variable
	
	public static int multiply(int a, int b, int c) {
		return a*b*c;
	}
	
	// 2. changing the data type of variables
	
	public static double multiply(double a, double b) {
		return a*b;
	}
	
	
	public static double multiply(int a, double b) {
		return a*b;
	}
	
	// 3. changing the order of parameters
	
	public static void multiply(double a, int b) {
		System.out.println(a+" * "+b+" = "+(a*b));
	}
	
	// different implementation of a same name method inside the same class
	// the methods must have same names
	// methods must have different parameters and implementation
	
	// can we overload constructors?  --> We can overload constructors --> How
	
	// Can we change return type
	
	// what is the difference between a method with a return type and with a void keyword?
}
