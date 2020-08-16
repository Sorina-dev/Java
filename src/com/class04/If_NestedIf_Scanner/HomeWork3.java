package com.class04.If_NestedIf_Scanner;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not.
		// If your user does not have a credit card then offer them.
		// If they do have one ask what is balance on the card?
		// If balance of the card is larger than 1000, tell them to pay off immediately
		// otherwise you can tell them that they can spend more.
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? Please answer with: Yes or No");
		String answer = input.nextLine();
		System.out.println(answer);
		String yes = "Yes";
		String no = "No";

		if (answer.equals("Yes")) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("Please write the balance on the card");
			int num1 = input1.nextInt();
			System.out.println(num1);
			if (num1 > 1000) {
				System.out.println("Please, pay off immediately");
			} else {
				System.out.println("You can spend more.");
			}
		} else {
			System.out.println("We can offer you a credit card");

			System.out.println("----------------------another way--------------------------------");

			Scanner scan = new Scanner(System.in);
			boolean cc;

			System.out.println("Do you have a Credit Card?(True or False)");
			cc = scan.hasNextBoolean();

			if (cc) {
				System.out.println("What is your Credit Card balance?");
				double balance = scan.nextDouble();

				if (balance > 1000) {
					System.out.println("Please, pay off immediately");
				} else {
					System.out.println("You can spend more.");

				}

			} else {
				System.out.println("Let me offer you our best Credit Card");
			}

		}
	}
}
