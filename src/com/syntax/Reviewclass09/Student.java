package com.syntax.Reviewclass09;

public class Student extends School{
	public Student(String name, String lastName, String stuId) {
		super(name, lastName); // we invoke super class constructer
		this.stuId=stuId;		
	}
	String stuId;
	
	public void study() {
		System.out.println(name+ " "+ lastName+" studies at "+ schoolName);
	}
	
	
	// Parent--> School class
	// Child --> Students
	
	// can we overload a method?
	
	// overloading --> different implementations of a method inside the same class
		// playing with arguments
	
	// overriding --> different implemtations of a method inside a different class (child class)
	
	// 1. We define and implement a method inside a class
	// 2. Create another class and extend it to the first class
	// 3. Implement the method that created inside the parent in different way
	// 4. Arguments must stay same -- Method signature must stay same

}
