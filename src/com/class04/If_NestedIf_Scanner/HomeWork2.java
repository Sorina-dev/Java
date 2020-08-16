package com.class04.If_NestedIf_Scanner;

import java.util.Scanner;

public class HomeWork2 {
public static void main(String[] args) {
	//Create a Java program that will ask user to input city and temperature. 
	//Your program should convert Fahrenheit into celsius
	//print "The temperature in the city __ is __"
	 Scanner city= new Scanner(System.in);
	 System.out.println("Please enter the city");
	 String town= city.nextLine();
	 System.out.println(town);
	 
	double celsius, fahrenheit;
	Scanner temp = new Scanner(System.in);
	System.out.println("Please enter the temperature");
	fahrenheit = temp.nextDouble();
	celsius = (fahrenheit-32)*(0.5556); // * 5/9
	System.out.println(celsius);
	
	System.out.println("The temperature in the city "+town+" is "+celsius+ " C");
	
	
}
}
