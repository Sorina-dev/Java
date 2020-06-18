package com.syntax.class08;

import java.util.Scanner;

public class ForLoopWithStringOrBoolean {
public static void main(String[] args) {
	//create a program that will be asking the user to apply for a credit card 10
	//as soon as you get an "yes' the program should stop asking
	Scanner scan = new Scanner(System.in);
	
	for (int i = 101; i <= 110; i++) {
		System.out.println("Do you want to apply for credit card?");
		String answer = scan.nextLine(); // or boolean
		
		if (answer.equals("yes")) {
			System.out.println("Congrats. Now you are in debt!");
			break;
		}
		
	}
	
}
}
