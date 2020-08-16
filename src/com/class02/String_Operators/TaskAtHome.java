package com.class02.String_Operators;

public class TaskAtHome {
	public static void main(String[] args) {
 
		//write a java program to add, subtract, multiply and divide two decimal values.
		//the program should say: " The ____ of 2 numbers __ and __ is equal to__."
		
		double num1 = 20.45;
		double num2 = 12.35;
		double sum = num1+num2;
		double sub = num1-num2;
		double mul = num1*num2;
		double div = num1/num2;
		String sum1 = "addition";
		String sub1 = "subtraction";
		String mul1 = "multiplication";
		String div1 = "division";
		
		System.out.println("The " + sum1 + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum + '.');
		System.out.println("The " + sub1 + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub + '.');
		System.out.println("The " + mul1 + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + mul + '.');
		System.out.println("The " + div1 + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + div + '.');
		System.out.println("----------------------------------------------------------------------------------");
		
		//write a program to find the square of the number 3.9. 
		//program should say:" The square of the ___ is __."
		
		float number = 3.9F;
		float numSquare = number * number;
		
		System.out.println("The square of the " + number + " is " + numSquare + '.');
		System.out.println("-----------------------------------------------------------------------------------");
		
		//write a program to print the area and perimeter of a rectangle with width = 5 and height = 8
		// program should say:" The perimeter of a rectangle with width __  and height __ is equal to __ and the area is __.
		
		int width = 5;
		int height = 8;
		int p = 2*(width + height);
		int a = width * height;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + p + " and the area is " + a + '.');
		
		
		
		
		
		
	}

}
