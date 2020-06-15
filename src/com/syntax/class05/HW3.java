package com.syntax.class05;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {

//		Write a program for user to enter his/hers birth month. Based on the month define the season.
//		Example: if user is born in June, July or August → season ="Summer".
//		At the end of the program we should see output as "You were born ______".

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your birth month");
		String month = scan.nextLine();

		String season; // or String season = "Unknown";
	

		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("December")) {
			 season = "Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season = "Spring";
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season = "Summer";
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			season = "Autumn";    
		}else {                          //without else will be an error or we should right String season = Unknown
			season = "Unknown";           //or add else as Unknown
		}
		System.out.println("You were born in " + season);
	}
}
