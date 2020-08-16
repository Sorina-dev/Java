package com.class05.LogicalOperators;

public class MoreLogicalOperator {
	public static void main(String[] args) {
		// We have 7 days of week
		// if day is 2,4-->SDLC class
		// if day is 6,7--> Java class
		// is day is 3 -->Review class
		// if day 1, 5--> No class
		int day = 7;  //cannot reassin the variable into a String eg: String day = "Tuesday";
		               // has to be String day2="Tuesday";
		// To compare the equality to numbers we use ==
		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("Java calss");
		} else if (day == 1 || day == 5) {
			System.out.println("no class");
		} else if (day == 3) {
			System.out.println("Review class");
		} else {
			System.out.println("wrong day");
		}
		System.out.println("***********Using string**************************************************");
		
		// to compare the equality of two strings we use ".equals"

		String day2 = "Tuesday"; // in case there are some Upper or lower case mismathch- ignore the case
		if (day2.equals("Tuesday") || day2.equals("Thursday")) {
			System.out.println("SDLC class");
		} else if (day2.equals("Saturday") || day2.equals("Sunday")) {
			System.out.println("Java class");
		} else {
			System.out.println("Not implemented");
		}

	}
}
