package com.class18.VariableTypes;

public class InstanceVariables {
	
	String name = "Yuriy"; //instance variable
	
	public static void main(String[] args) {
		
		String name = "Kristina"; // local variable
		System.out.println(name);//Kristina  // printing local variables
		
		//we create an Object or we instanciate a class or create an instance of the class
		InstanceVariables obj = new InstanceVariables();
		obj.name = "Jane";
		System.out.println(obj.name);//Jane   //to print the instance variables
		
		//would like to change values from Kristina to Castro --> changing value of the local variable
		name = "Castro";
		System.out.println("New values of the local variable "+ name);
		
		//would like to change Jane to Ed--> changing value of the instance variable
		obj.name = "Ed";
		System.out.println("New value of instance variable "+obj.name);
		
		System.out.println("Printing value of name using 2 instance");
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name); // the variable that is outside the method but inside the class
		
	}

}
