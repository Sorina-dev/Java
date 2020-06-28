package com.syntax.class14;

public class StringMethods {
	public static void main(String[] args) {
		// 1 way to create a String using String literal --> this is the most popular
		// way
		String name = "Olga"; // literal

		// 2nd way to create String using new keyword
		String name1 = new String();
		name1 = "Olga";

		System.out.println(name);
		System.out.println(name1);

		// methods of String class
		String school = "Syntax";
		System.out.println("---------- .length() method ---------------");
		// tells how many characters are in teh String
		int size = school.length();
		System.out.println("lenght of the string is " + size);

		String greetings = " Hello Syntax ";
		int sizeOfDifferentString = greetings.length();
		System.out.println(sizeOfDifferentString);

		System.out.println("----------- .toUpperCase() method ------------");

		String city = "Washington DC";
		String newcity = city.toUpperCase();
		System.out.println(newcity);

		System.out.println("------------- .toLowerCase() method -------------");

		String lowerCaseString = newcity.toLowerCase();
		System.out.println(lowerCaseString);

		System.out.println("------------- .concat() method ------------------");

		String country = "USA ";
		String capital = "Washington DC";

		// + with Strings serves as concatenation operator
		// + with numbers serves as arithmetic operator

		System.out.println(country + capital);
		System.out.println(country.concat(capital)); // will work only if both values are of String type

		int day = 27;
		String month = " June ";
		System.out.println(day + month);
		System.out.println(month + day);

		// System.out.println(month.concat(day)); //cannot be used as both values are
		// not of String type
		// System.out.println(day.concat(month));// cannot be used as day is an int type

		System.out.println("-------------------- .isEmpty() method -----------------------");

		// if length of the string is zero --> then it is empty
		String str = " ";
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty); // false as there is space character

		String str1 = "";
		System.out.println(str1.isEmpty()); // true as there is zero characters

		System.out.println("----------------- .trim() method ----------------------------");

		// remove spaces before and after the string
		String cat = "My name is Jessy";
		String dog = "     My name is     Charly    "; // cuts only the ending and beginning white spaces
		System.out.println(cat.trim());
		System.out.println(dog.trim());

	}

}
