package com.class19.AccessModifiers;

public class Employee {
	//related to AccessingEmployeeClassMembers

public static String company;//any class from any package in the project
	
	public String name, lastName;//any class from any package in the project
	protected int age;//if class within same package it can access all protected members
	double salary;////if class within same package it can access all default members
	private long ssn;//only it is own class/same can have an access to private members
	
	public static void displayCompany() {
		System.out.println("Employee works at "+company);
	}
	
	public void displayName() {
		System.out.println("Employee name is "+name +" "+lastName );
	}
	
	protected void displayAge() {
		System.out.println("Employee is "+age+" years old");
	}
	
	void displaySalary() {
		System.out.println("Employee salary is "+salary);
	}
	
	private void displaySsn() {
		System.out.println("Employee ssn is "+ssn);
	}
	
	public static void main(String[] args) {
		company="Google";
		Employee emp=new Employee();
		emp.name="Ahmet";
		emp.lastName="Smith";
		emp.age=21;
		emp.salary=90000;
		emp.ssn=123456789;
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		emp.displaySsn();
	}
}
