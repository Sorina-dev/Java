package com.class13.OOPsClass_Object;

public class CarFactory {
	//related to Car class
public static void main(String[] args) {
	Car car1 = new Car();
	car1.make = "Tesla";
	car1.model = "X";
	car1.color = " Red";
	car1.year = 2020;
	car1.speed = 200;
	System.out.println("make of 1 car is "+ car1.make + " and model is " + car1.model + " and it is in " + car1.color + " color");
	
	System.out.println("------- Accessing methods from Car class using car1 ----");
	car1.drive();
	car1.transportPeople();
	car1.reverse();
	
	//building an object of a car
	Car car2 = new Car();
	car2.make = "BMW";
	car2.model = "M5";
	car2.color = "Blue";
	car2.year = 2018;
	car2.speed = 240;
	System.out.println("make of car 2 is "+ car2.make);
	
	System.out.println("------- Accessing methods from Car class using car2 ----");
    
	car2.drive();
	car2.transportPeople();
	car2.reverse();
	
	// new Bus(); compiler will give an error
	//because we never created Bus class
	
}
}
