package com.class28.Encapsulation;

public class CarTest {
	public static void main(String[] args) {
		
		Sedan car1 = new Sedan();
		car1.length = 40;
		car1.carPrice = 100000;
		System.out.println(car1.calculateSalePrice());
		
		Truck car2 = new Truck();
		car2.weight = 280;
		car2.carPrice = 20000;
		System.out.println(car2.calculateSalePrice());
	}

}
class Car {
	/*
	 * Create a Class Car that would have the following fields: carPrice and color
	 * and method calculateSalePrice() which should be returning a price of the car.
	 * Create 2 sub classes: Sedan and Truck. The Truck class has field as weight
	 * and has its own implementation of calculateSalePrice() method in which
	 * returned price calculated as following: if weight>2000 then returned price
	 * car should include 10% discount, otherwise 20% discount. The Sedan class has
	 * field as length and also does it is own implementation of
	 * calculateSalePrice(): if length of sedan is >20 feet then returned car price
	 * should include 5% discount, otherwise 10% discount
	 */
	
	double carPrice;
	String color;
	
	public double calculateSalePrice() {
		return carPrice;
	}
}

class Sedan extends Car {
	int length;
	
	public double calculateSalePrice() {
		if (length > 20) {
			carPrice -= carPrice * 0.05;
		} else {
			carPrice -= carPrice * 0.1;
		}
		return carPrice;
	}
}

class Truck extends Car {
	int weight;
	
	public double calculateSalePrice() {
		if (weight > 2000) {
			carPrice = carPrice - (carPrice * 0.1);
		} else {
			carPrice = carPrice - (carPrice * 0.2);
		}
		
		return carPrice;
	}
}