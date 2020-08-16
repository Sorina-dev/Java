package com.class24.MethodOverriding_Polymorphism;

public class Employee {

	double salary;
	
	void getPaid() {//overriden method
		System.out.println("Employee gets paid salary = "+salary);
	}	
}

class Contractor extends Employee{
	
	double hourlyRate;
	
	void getPaid() {//overriding method
		System.out.println("Contractor gets paid hourly rate="+hourlyRate);
	}
	
}
class FulltimeEmployee extends Employee{
}
