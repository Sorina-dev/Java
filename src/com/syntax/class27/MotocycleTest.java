package com.syntax.class27;

public class MotocycleTest {
public static void main(String[] args) {
		
	//new Drivable();CE: cannot instantiate
	
			//new Motorcycle();CE: cannot instantiate
			
			System.out.println(" ------ Object of Motorcycle type ----- ");
			Motorcycle m=new Bike();
			m.driving();
			m.breaking();
			m.operateVehicle();
			
			
			//Motorcycle.DRIVE="not safe";CE: cannot change value of final variable
			System.out.println(Motorcycle.DRIVE);//static variable accessible through class name
			
			System.out.println(" ------ Object of Drivable type ----- ");
			
			Drivable d=new Bike();
			d.driving();
			d.breaking();
			System.out.println(Drivable.DRIVE);
			
			Vehicle v=new Bike();//Vehicle --> Motorcycle --> Bike
			v.operateVehicle();
		}
}
 interface Drivable {//interface is collection of public abstract methods and public static final variables

		String DRIVE="Drive safe";//by default compiler adds public static final to variables
		
		//int maxSpeed; cannot have instance variables because compiler adds PSF
		
		void driving();//by default compiler adds public abstract to methods
		
		void breaking();
	}
	// we can extends ONLY 1 class but we can implement MULTIPLE interfaces
	abstract class Motorcycle extends Vehicle implements Drivable {//abstract class
		
		public void driving() {
			System.out.println("Motorcycle is driving");
		}	
	}

	class Bike extends Motorcycle {//concrete class
		
		public void breaking() {
			System.out.println("Bikes can break");
		}
	}

	class Vehicle {
		
		public void operateVehicle() {
			System.out.println("To operate any vehicle we need to have driver lisence");
		}
}
