package com.class18.VariableTypes;

public class Employee {
	//I did
/*
 * Create a Class called Employee:
Create three  variables  eID , salary and set the CEO to “Sumair” 
Create two objects of the class Employee 
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */
//	static String CEO = "Sumair";
//	String eID;
//	int salary;
//	
//	void display() {
//		System.out.println("Employee " + eID + " has the salary " + salary + " and the CEO is " + CEO);
//	}
//	public static void main(String[] args) {
//		Employee em1 = new Employee();
//		em1.eID = "Sorina";
//		em1.salary = 3000;
//		em1.display();
//		
//		Employee em2 = new Employee();
//		em2.eID = "Valera";
//		em2.salary = 3000;
//		em2.display();
//		
//		Employee em3 = new Employee();
//		em3.eID = "Maria";
//		em3.salary = 2000;
//		em3.display();
		
	int empID;
	double salary;
	
	static String CEO = "Sumair";
	
	public static void main(String[] args) {
		
		System.out.println(Employee.CEO); //accessing static variable -->class and name
		
		//accessing static variable within the same class
		System.out.println(CEO);
		
		//accessing static method
		sayHelloToCEO();
	}
		static void sayHelloToCEO() {
			System.out.println("Hi " + CEO);
		}
		
	}

