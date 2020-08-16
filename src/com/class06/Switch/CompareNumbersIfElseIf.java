package com.class06.Switch;

import java.util.Scanner;

public class CompareNumbersIfElseIf {
	public static void main(String[] args) {
		// the largest between 3 numbers

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the first number");
		double a = scan.nextDouble();

		System.out.println("Please enter the second number");
		double b = scan.nextDouble();

		System.out.println("Please enter the third number");
		double c = scan.nextDouble();

		double largest;

		// 1st way
//	if (a>b && a>c) {
//		largest = a;
//	}else if (b>a && b>c) {
//		largest = b;
//	}else if (c>a && c>b) {
//		largest = c;
//	}
//	System.out.println("The largest number is "+ largest);

		// 2nd way
//	if (a>b && a>c) {
//		largest = a;
//	}else if (b>c) {
//		largest =b;
//	}else {
//		largest = c;
//	}	

//	System.out.println("The largest number is "+ largest);	

		// 3rd way with nested if

		if (a > b) {
			if (a > c) {
				largest = a;
			} else {
				largest = c;
			}
		} else {
			if (b > c) {
				largest = b;
			} else {
				largest = c;
			}
		}
		System.out.println("The largest number is "+ largest);	
	}

}
