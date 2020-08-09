package com.syntax.class31;

public abstract class Insurance {
	String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();
}

class Car extends Insurance {

	String carModel;

	public Car(String carModel, String insuranceName) {
		super(insuranceName);
		this.carModel = carModel;
	}

	public void getQuote() {
		System.out.println("Get a quote for " + carModel + " from " + insuranceName);
	}

	public void cancelInsurance() {
		System.out.println("Cancel the insurance for " + carModel + " from " + insuranceName);
	}
}

class Pet extends Insurance {
	String petType;

	public Pet(String petType, String insuranceName) {
		super(insuranceName);
		this.petType = petType;
	}

	public void getQuote() {
		System.out.println("Get a quote for " + petType + " from " + insuranceName);
	}

	public void cancelInsurance() {
		System.out.println("Cancel the insurance for " + petType + " from " + insuranceName);

	}
}

class Health extends Insurance {
	public Health(String insuranceName) {
		super(insuranceName);
	}

	public void getQuote() {
		System.out.println("I am a getQuote method in Health class");

	}

	public void cancelInsurance() {
		System.out.println("I am a cancelInsurance method in Health class");
	}
}
