package com.class26.AbstractModifier;

public class VechicleTest {
	public static void main(String[] args) {

		Vehicle lambo=new Lamborgini("12346879767897087kjhvjhv");
		lambo.drive();
		lambo.start();
		lambo.stop();
		lambo.openTrunk();
		int total = Vehicle.getTotal();
		System.out.println(total);
		//Parent = Child
		System.out.println(" ----   second object ----- ");
		Car car=new Lamborgini("hbghg876867kjhvjhv");
		car.drive();
		car.start();
		car.stop();
		car.openTrunk();
		
		total=Car.getTotal();
		System.out.println(total);
	}
}
 abstract class Vehicle {

	public String vin;
	public static int totalVehicles;  //can create static and instance variables in abstract class
	
	public Vehicle(String vin) { //can create constructors in abstract class
		this.vin=vin;
		totalVehicles++;
	}
	
	public static int getTotal() {
		return totalVehicles;
	}
	
	public void drive() {
		System.out.println("All vehicle drives");
	}
	
	public void stop() {
		System.out.println("All vehicles stop by pressing break");
	}
	
	public abstract void start();
	
	public abstract void openTrunk();
}

abstract class Car extends Vehicle  {
	
	public Car(String vin) { 
		super(vin);// means of Vehicle class
	}
	
	public void openTrunk() {   // child class implemented only one method, needed for a child class
		System.out.println("All cars can open trunk automatically");
	}
}

class Lamborgini extends Car {// subclass of child class implemented the last needed method
	
	public Lamborgini(String vin) {
		super(vin);// of the immediate parent class, means of Car class
	}
	
	public void start() {
		System.out.println("Lamborgini starts magically");
	}
}