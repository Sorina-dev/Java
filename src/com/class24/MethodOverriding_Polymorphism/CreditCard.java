package com.class24.MethodOverriding_Polymorphism;

/*
 * Create a class CreditCard and define variable balance and interest. 
 * Create an instance method that will calculate interest based on the given balance. 
Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
Call the method by creating an object of each of the three classes.
 */
public class CreditCard {
	double balance, interest;

	void interest(double balance) {
		double anualPercentageRate = balance / 365;
		double interest = anualPercentageRate * balance;
		System.out.println(interest);
	}

}

class Visa extends CreditCard {

}

class AX extends CreditCard {

	void interest(double balance) {
		double anualPercentageRate = balance / 360;
		double interest = anualPercentageRate * balance;
		System.out.println(interest);
	}
}