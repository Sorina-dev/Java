package com.class23.MethodOverloading;

public class TestingSuper {

	public static void main(String[] args) {
		
		SubClass obj=new SubClass();
		obj.displayName();
		obj.callingParentMethod();

		System.out.println("-- Object of the parent class -------");
		Superclass obj1=new Superclass();
		obj1.printHello();
		System.out.println(obj1.name);
	}
}
