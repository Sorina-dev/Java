package com.syntax.class20;

public class Car {
	
	public static String make;
	protected String model;
	int year;
	private double price;

	public void displayInfo() {
		System.out.println("We build " + year + " " + make + " " + model + " for price = $" + price);
	}
	
	Car(){
		System.out.println("I am a constructor. I have not return type and my name is same as class");
	}

	public static void main(String[] args) {

		Car car=new Car();
		/*
		 	Car --> class name
		 	car --> reference variable
			new --> keyword
			Car(); --> calling Constructor --> block of the code that intialize the obj
		 */
		
		car.displayInfo();
		System.out.println(car.model);
		
		//static String driver; --> local variables CANNOT BE STATIC
		//System.out.println(driver);
	}
}
