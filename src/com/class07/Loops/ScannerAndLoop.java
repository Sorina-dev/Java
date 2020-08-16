package com.class07.Loops;

import java.util.Scanner;

public class ScannerAndLoop {
public static void main(String[] args) {

	//we want to ask 5 times the users his/her and print Good afternoon____
	Scanner scan= new Scanner(System.in);
	
	//Do while loop will run 5 times
	int num =1;
	do {
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		
		System.out.println("Good Afternoon "+ name);
		num++;
	}while (num<=5);
	
	//while loop will run5 times
	int num2 =1;
	while(num2<=5) {
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		
		System.out.println("Good Afternoon "+ name);
		num2++;
	}
	
	
}
}
