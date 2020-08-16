package com.class05.LogicalOperators;

import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {

		// Write a program to find largest number among three numbers
		// using nested if provided by a user (numbers must be distinct)
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter how many miles did you run yesterday?");
		int num1 = scan.nextInt();
		
		System.out.println("Please enter how many miles did you run the other day?");
		int num2 = scan.nextInt();
		
		System.out.println("Please enter how many miles did you run the day before yesterday?");
		int num3 = scan.nextInt();
		
		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.println("Yesterday you burned the most callories.");
			} else {
				System.out.println("The day before yesterday you burned the most callories.");
			}
		} else {
			if (num2 >= num3) {
				System.out.println("The other day you burned the most callories.");
			} else {
				System.out.println("The day before yesterday you burned the most callories.");
			}
		}

	}

}
