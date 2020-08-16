package com.class13.OOPsClass_Object;

public class Car {
	//related to CarFactory class
 // define car features
	String make;
	String model;
	String color;
	int year;
	int speed;
	
	//define behavior for all methods
	void reverse() {
		System.out.println(make + "can reverse");
	}
	void transportPeople() {
		System.out.println(make + " can transport people");
	}
	void drive() {
		System.out.println(make + " can drive");
	}
	void stop() {
		System.out.println(make + " will stop");
	}
	
	
	// main method can be done in a different class (window)
	public static void main(String[] args) { // should be written in main method in order to be executed
		System.out.println("hello, I am code from main method");
		
		Car c1=new Car();  //new Car(); object from class car,
		// c1- variable, name; Car the class
		c1.make = "Toyota"; //String
		c1.model = "Camry";
		c1.color = "yellow";
		c1.year = 2020;   // int
		c1.speed = 180;
		// calling method drive
		c1.drive();
		//calling method transportPeople
		c1.transportPeople();
		c1.stop();
		c1.reverse();
		} 
}
