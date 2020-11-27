package com.class04.If_NestedIf_Scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//capture the name from the user and print
		//your name is ___
		//ask the user to enter the age and print
		//Your name is__ and age is ___
		
		//1. we bring the scanner class into our program
		//System.in --> read from keyboard/console
		Scanner input = new Scanner(System.in);
		
		
    // instructing the user what to enter
		System.out.println("Please enter your full name!");
		
		//capturing the whole line into a text variable
		String name = input.nextLine();
		System.out.println("Your name is "+name);
		
		// instructing the user what to enter
		System.out.println("Please entwer your age as double!");
		//capturing the text as a double
		
		//if its not a double an error will be printed
		double albanianAge = input.nextDouble();
		System.out.println("Your name is "+name+" your age is " + albanianAge);
		
	}

}
