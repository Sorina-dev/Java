package com.class35.Try_Catch_Finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		

	try {
		int num = sc.nextInt();
	}catch(InputMismatchException e) {
		System.out.println("Enter Integers only!");
		
	}
		
	}

}
