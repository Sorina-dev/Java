package com.syntax.class20;

public class BetterCar {
	//declaring the instance, static variables
	public static String make="BMW";
	protected String model, color;
	int year;
	private double price;
	//method
	public void displayInfo() {
		System.out.println("We build " + color + " "+year+" " + make + " " + model + " for price = $" + price);
	}
	//Constructor initializing// dataType and name of all above 
	BetterCar(String carModel, String carColor, int carYear, double carPrice) {
		model=carModel;  //don't use the same name not to confuse java with local ans instance variable
		color=carColor;  // or put this.  in front
		year=carYear;
		price=carPrice;
	}
}
