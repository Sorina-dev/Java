package com.class05.LogicalOperators;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {

//Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
//	if the average score >=90 → grade=A
//  if the average score >= 70 and <90 → grade=B
//	if the average score>=50 and <70 → grade=C
//	if the average score<50 → grade=F
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the score for quiz");
		int quiz = scan.nextInt();

		System.out.println("Please enter the score for mid term");
		int midTerm = scan.nextInt();

		System.out.println("Please enter the final score");
		int finalScore = scan.nextInt();

		int averageScore = ((quiz + midTerm + finalScore) / 3);
		System.out.println(averageScore);

		if (averageScore >= 90);{
			System.out.println("Congratulations! You got an A grade");
		}
		if (averageScore >= 70 && averageScore < 90) {
			System.out.println("You got a B grade");
		}
		if (averageScore >= 50 && averageScore < 70) {
			System.out.println("You got a C grade");
		}
		if (averageScore < 50) {
			System.out.println("You got a F grade");
		}

	}
}
