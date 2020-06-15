package com.syntax.class06;

import java.util.Scanner;

public class HWSwitch06 {
	public static void main(String[] args) {
		// Using scanner class create calculator.
		// Allow user to enter 2 numbers and operator(+,-,*,/).
		// Based on operator provide the result to user.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int x = scan.nextInt();
  //      int result = 0;
        
		System.out.println("Please enter the operator");
		char operator = scan.next().charAt(0);

		System.out.println("Please enter 2nd number");
		int y = scan.nextInt();

		switch (operator) {
		case '+':
			System.out.println(x + y);
			break;
		case '-':
			System.out.println(x - y);
			break;
		case '*':
			System.out.println(x * y);
			break;
		case '/':
			System.out.println(x / y);
			break;
		default:
			System.out.println("Invalid");
		}
		
//		switch (operator) {
//		case '+':
//			result = x + y;
//			break;
//		case '-':
//			result = x - y;
//			break;
//		case '*':
//			result = x * y;
//			break;
//		case '/':
//			result = x / y;
//			break;
//		default:
//			result = 0
		//System.out.println("Invalid operator");
//		}
 //  System.out.println("The result is "+ result);
	}
}
