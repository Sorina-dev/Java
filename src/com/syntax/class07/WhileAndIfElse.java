package com.syntax.class07;

public class WhileAndIfElse {

	public static void main(String[] args) {
//		Create a boolean variable workDay and assign true create int variable day and assign it to 1
//		●As long as it is workDay print “I need a day off” and increase day.
//		●Once day is 6 print “I do not need a day off any more”
		boolean workDay = true;
		int day = 1;

		while (workDay) {
			if (day <6) {
				System.out.println("I need a day off");
			}else {
				System.out.println("I do not need a day off any more");
				workDay = false;     //otherwise it wont stop executing
			} day++;
		}
			
		System.out.println("--------------------------------");
		//2nd way
//		boolean workDay = true;
//		int day = 1;
//		
//		while (workDay && day <=6) {
//			if (day<6) {
//				System.out.println("I need a day off");
//			}else {
//				System.out.println("I do not need a day off any more");
//				workDay = false;
//			}day++;
//		}

	}
}
