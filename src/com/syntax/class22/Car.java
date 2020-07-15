package com.syntax.class22;

public class Car {
	String make;

	public Car(String make) { //constructor
		this.make=make;
	}
}

class Tesla extends Car{
	
	boolean autopilot;
	
	public Tesla(String make,boolean autopilot){ //have to insert parent instance too
		super(make); //call parent constructor and instance
		this.autopilot=autopilot;
	} // constructor
	
	void info() {
		System.out.println("We buid "+make+" that has autopilot feature ="+autopilot );
	}
}

