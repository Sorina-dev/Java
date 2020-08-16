package com.class06.Switch;

import java.util.Scanner;

public class HWSwitch01 {
public static void main(String[] args) {
	//Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
	//At the end your program should print which grade was entered by a user with explanation.
	Scanner scan= new Scanner(System.in);
	System.out.println("Please enter your grade");
	
	char grade= scan.next().charAt(0);
	String explanation;
	
	switch (grade) {
	case 'A':
	case 'a':
		explanation="Excellent";
		break;
	case 'B':
	case 'b':
		explanation="Good";
		break;
	case 'C':
	case 'c':
		explanation="Average";
		break;
	case 'D':
	case 'd':
		explanation="Bad";
		break;
	default:
		explanation ="Not Acceptable";
	}	
	System.out.println("Your grade is "+ grade +'-'+ explanation);
}
}
