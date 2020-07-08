package com.syntax.class16;

public class TaskMethods {
	//related to TaskMethodsTest class
	
	//Create a method that will take 2 parameters as
	//a numbers and prints which number is larger.
	void larger (int a , int b) {
		if (a > b) {
			System.out.println(a + " is larger then " + b);
		}else {
			System.out.println(b + " is larger then " + b);
		}
	}
	// Create a method that will take a number and prints whether the number is even
	 //or odd.
	
	void evenOdd (int n) {
		if (n % 2 == 0) {
			System.out.println("The number " + n + " is even");
		}else {
			System.out.println("The number " + n + " is odd");
		}
	}
	//Create a method that will print whether given String is palindrome or not.
	
	void palindrome (String word) {
		String reverse = "";
		for (int i = word.length()-1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		if (reverse.equals(word)) {
			System.out.println(word + " is a palindrome");
		}else {
			System.out.println(word + " isn't a palindrome");
		}
	}
	//Create a method that will say Hello in different language based on the
	// country that will passed when method is executed.
	
	void sayHello(String country) {
		country = country.toLowerCase();

		switch (country) {

		case "usa":
			System.out.println("Hello");
			break;

		case "turkey":
			System.out.println("Merhaba");
			break;

		case "egypt":
			System.out.println("Ehlen wa Sahlen");
			break;
		default:
			System.out.println("Hi");
		}
	}
	
}
