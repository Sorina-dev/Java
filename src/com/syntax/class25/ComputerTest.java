package com.syntax.class25;
/*
 * Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 

Define common behavior within and some fields in parent class and override some of the methods in 
child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute 
available methods.
 */
public class ComputerTest {

	public static void main(String[] args) {
		
		Computer[] c = {new Apple("black"), new Lenovo ("white"),new HP("orange"),new Dell ("silver")};
		for (Computer com : c) {
			com.work();
		}
		
		Apple a = new Apple("black");
		a.display();
	}
}
class Computer{
	public String color;

	Computer(String color){
		this.color = color;
	}
	
	public void work() {
		System.out.println(color + " " + "computer works");
	}
}
class Apple extends Computer{
	Apple(String color){
		super(color);
	}
	
	public void display() {
		System.out.println("Apple displays");
	}
	public void work() {
		System.out.println(color + " " + "computer works");
	}
}
class Lenovo extends Computer{
	Lenovo(String color){
		super(color);
	}
	public void work() {
		System.out.println(color + " " + "computer works");
	}
}
class HP extends Computer{
	HP(String color){
		super(color);
	}
	public void display() {
		System.out.println("HP displays");
	}
	public void work() {
		System.out.println(color + " " + "computer works");
	}
}
class Dell extends Computer{
	Dell(String color){
		super(color);
	}
	public void work() {
		System.out.println(color+ " "  + "Dell doesn't work");
	}
	
}