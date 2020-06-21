package com.syntax.class10;

import java.util.Scanner;

public class FloorsAndRooms {
	public static void main(String[] args) {
//		There are 4 floors
//		Room numbers go from 1.1, 1.2,...1.7
//		Ask the user how many floors does the hotel have
//		and how many rooms on each floor
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many floors does your hotel have?");
		int floors = scan.nextInt();
		System.out.println("How many rooms on each floor?");
		int rooms = scan.nextInt();
		
		for (int i = 1; i <= floors; i++) {
			//we just moved to the next floor
			System.out.print("Floor #" + i + "--> ");
			//we are iterating the rooms
			for (int j = 1; j <= rooms; j++) {
				System.out.print(i + "."+ j + " ");
			}
			//The stairs to the next floor
			System.out.println();
		}
		
		
	}

}
