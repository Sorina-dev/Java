package com.syntax.Reviewclass09;

public class MethodOverloading {
	// polymorphism --> having more than one form or shape
		// for java --> ability to implement a method in different ways
		
		// Static Binding -- Compile Time Polimorphism -- Method Overloading
		
		// diffrent implentations of a method or constructor inside the same class
		
		// 1. change the type parameters
		// 2. change the number parameter
		// 3. change the order of parameters
		
		public void method() {
			System.out.println("I am a methot without any parameter");
		}
		
		public void method(String str) {
			System.out.println("I am a method with a string parameter");
		}
		
		public void method(int i) {
			System.out.println("I am a method with an int parameter");
		}
		
		public void method(String str, int i) {
			System.out.println("I am a method with one String and one int parameter");
		}
		
		public void method(int i, String str) {
			System.out.println("I am a method with one int and one String parameter");
		}
		
		public void method(String str1, String str2) {
			System.out.println("I am a method with two String parameters");
		}
		
		// we cannot overload a method by changing the order of parameters if both parameters have same type
		
//		public void method(String str2, String str1) {
//			System.out.println("I am a method with two String parameters");
//		}

}
