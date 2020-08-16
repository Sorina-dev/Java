package com.class06.Switch;

import java.util.Scanner;

public class Homework1WithSwitch {
	public static void main(String[] args) {

		//write a program for user to enter his/her birth month
		//based on the month define the season
		//eg:if user is born in June, July or August ->season"Summer"
		//at the end of the program we should see output as "you were born in ___"
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month=scan.next();
		
		String season = "Unknown";   //here initialise the variable
		
		switch (month.toLowerCase()){   // in case the user inserts with lower case, we have to write the values also with lower case
			case "december":
			case "january":
			case "february":
				season ="Winter";
				break;
			case "march":
			case "april":
			case "may":
				season = "Spring";
				break;
			case "september":
			case "october":
			case "november":
				season = "Fall";
				break;
			case "june":
			case "july":
			case "august":
				season= "Summmer";
				break;
			default:
				season= "Unknown";     //or here initialise the variable
	
		}
		System.out.println("You were born in "+ season);
		
		
	}
}
