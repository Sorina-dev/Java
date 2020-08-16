package com.class29.Collections_WrapperClasses;

public class WrapperDemo {
	public static void main(String[] args) {

		int num =10;
		
		Integer num1=100;//Autoboxing
		String str=num1.toString().concat("hello"); // integer convert to String
		System.out.println(str);
		
		int stringLenght=num1.toString().length();
		System.out.println(stringLenght);
		
		Byte b=10;
		System.out.println(b.MAX_VALUE);
		
		Boolean bool=true;
		
		Character ch='a';
		
		Double d=10.99;
		
	}
}
