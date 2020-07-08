package com.syntax.class18;

public class House {

	//related to Cat class
	public static void main(String[] args) {

		Cat cat1 = new Cat(); // cat1 --> local variable//inside a method
		cat1.name = "Jessy";
		cat1.age = 8;
		cat1.color = "grey"; // accessing instance variable and assigning value

		String color = "Yellow";// declaring local variable

		Cat cat2 = new Cat();
		cat2.name = "Lucy";
		cat2.age = 1;
		cat2.color = "white";
		cat2.name = "Bonchuk"; //re-assigning instance variable

//		System.out.println("Name of 1st cat="+cat1.name);
//		System.out.println("Age of cat "+cat1.age);
//		System.out.println("Name of 2nd cat="+cat2.name);

		cat1.displayCat();
		cat2.displayCat();
	}
}
