package com.class04.If_NestedIf_Scanner;

public class NestedIf {
	public static void main(String[] args) {
		boolean isMorning = true;
		boolean isSchool = false;
		int time = 20; // 8 pm
		if (isMorning) {
			System.out.println("Good morning!");
			if (isSchool) {
				System.out.println("Friends");
			} else {
				System.out.println("family");
			} // nested if
		} else {
			System.out.println("Good afternoon!");
		}

		System.out.println("Viktoria has no questions");// has nothing with the conditions
	}
}