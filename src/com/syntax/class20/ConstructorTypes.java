package com.syntax.class20;

public class ConstructorTypes {
	ConstructorTypes() {//non argument constructor
		System.out.println("I am a constructor");
	}

	ConstructorTypes(String str) {//parameterized constructor
		System.out.println("I am a constructor with 1 String parameter " + str);
	}

	ConstructorTypes(int num) {
		System.out.println("I am a constructor with 1 int parameter " + num);
	}

	ConstructorTypes(double num) {
		System.out.println("I am a constructor with 1 double parameter " + num);
	}
	
	ConstructorTypes(String name, int age){
		System.out.println("I am a constructor with 2 parameters "+name+" "+age);
	}

	public static void main(String[] args) {

		ConstructorTypes obj = new ConstructorTypes("Aidana", 18);
		System.out.println("I am a code inside main method");
		speak("Hello Class");
	}

	static void speak(String str) {
		System.out.println(str);
	}
}
