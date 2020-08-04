package com.syntax.Reviewclass10;

public class Vehicles {
public static void main(String[] args) {
		
		Bicycle bicycle=new Bicycle();
		
		bicycle.changeGear(12);
		bicycle.speedUp(25);
		bicycle.applybreak(4);
		
		bicycle.printState();
	}

}
interface Vehicle {
	// Steps to achieve abstraction with interface
	// 1. Create an interface
	// 2. Create public abstract methods and/or public static final variables inside interface
	// 3. Create a class and apply inheritance
	// 4. Implement all unimplemented methods inside the concrete class
	
	void changeGear(int gear);  // --> public abstract
	void speedUp (int speed);
	void applybreak(int brk);
	
	default void lastMethod() {};
	
	// can we make abstract methods other than public?
	// can we decrase visibility?
	// can we have static class in interface?  --> Yes
	// can we have default methods inside interface? --> Yes
	
	default void method1() {
		System.out.println("I am a method implemented inside Interface");
	}
	
	// ChromeDriver class extends RemoteWebdriver  implements WebDriver interface
	
}
class Bicycle implements Vehicle{
	
	int gear;
	int speed; 
	
	@Override
	public void changeGear(int NewGear) {		
		gear=NewGear;
	}
	@Override
	public void speedUp(int spd) {
		speed+=spd;
	}
	@Override
	public void applybreak(int brk) {
		speed-=brk;
	}
	
	public void printState() {
		System.out.println("Current state of the Bicycle");
		System.err.println("Gear : "+gear);
		System.out.println("Speed : "+speed);
	}
}