package com.syntax.class16;

public class DifferentMethodsTest {
	public static void main(String[] args) {
		
		 DifferentMethods obj=new DifferentMethods();
		 //call method sayHello
		 obj.sayHello(2);
		 
		 System.out.println(" -------  ");
		 obj.sayHello(5);
		 
		 //call method printAnyWord
		 obj.printAnyWord("I love you", 3);
		 obj.printAnyWord("Bye", 5);
		 
		 //call method isHungry
		 obj.isHungry(false);
	}
}
