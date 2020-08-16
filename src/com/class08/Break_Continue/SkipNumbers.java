package com.class08.Break_Continue;

public class SkipNumbers {
	public static void main(String[] args) {
		//I want to print from 1- 10
		//but I want to skip 5, 6, 7
		System.out.println("skipping numbers 5,6,7");
		for (int i = 1; i < 11; i++) {
			if(i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);
		}
		//we want to print number from 1- 100
		//but we want to skip number between 35 to 55
		System.out.println("I don't want to print numbers from 35 to 55");
		
		for (int i = 1; i <= 100; i ++) {
			if (i >= 35 && i <= 55) {
				continue;
			}
			System.out.println(i);
		}
	}

}
