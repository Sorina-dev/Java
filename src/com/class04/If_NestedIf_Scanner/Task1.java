package com.class04.If_NestedIf_Scanner;

public class Task1 {
	public static void main(String[] args) {

		boolean diploma = true;
		double gpaScore = 2.5;

		if (diploma) {
			System.out.println("Congratulations!");
			if (gpaScore >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("Get a degree");
		}
		System.out.println("*****************************");

// Is student completed the quiz we'll check the score
		// if score > 90 -->Great job!
		// if score 80 --> Well done!
		// if score > 70 --> Just passed!
		// otherwise --> You failed!
		//
		// if Student didn't complete the quiz,--> Please finish your quiz!

		boolean completed = true;
		if (completed) { // let's check the score
			int score = 82;
			if (score >= 90) {
				System.out.println("Great job!");
			} else if (score >= 80) {
				System.out.println("Well done!");
			} else if (score >= 70) {
				System.out.println("Just passed!");
			} else {
				System.out.println("You failed!");
			}
		} else {
			System.out.println(" Please finish your quiz!");
		}
	}

}
