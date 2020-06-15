package com.syntax.class05;

import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
//Write a program to find largest of three double values using if-else..
//if and logical operators provided by a user (numbers must be distinct)

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the exact salary received on your Card for June");
		double salary1 = scan.nextDouble();
		System.out.println("Please enter the exact salary received on your Card for July");
		double salary2 = scan.nextDouble();
		System.out.println("Please enter the exact salary received on your Card for August");
		double salary3 = scan.nextDouble();
		
		 if( salary1 >= salary2 && salary1 >= salary3) {
			 System.out.println(salary1 + " is the highest payment for Summer.");
		 }else if (salary2 >= salary1 && salary2 >= salary3) {
			 System.out.println(salary2 + " is the highest payment for Summer.");
		 }else {
			 System.out.println(salary3 + " is the highest payment for Summer.");
		 }
	}
}
