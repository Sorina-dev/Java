package com.syntax.class04;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		//ask user what is the amount of loan is needed.
		//If loan is less or equal to 200,000 then you would lend the money 
		//otherwise you would reject the client.
		Scanner loan = new Scanner(System.in);
		
		System.out.println("Please enter the needed ammount of loan!");
		int num1= loan.nextInt();
		if (num1<=200000) {
			System.out.println("You will receive the loan");
		}else {
			System.out.println("Sorry, you won't receive the loan");
			
		}
		
		
	}
}
