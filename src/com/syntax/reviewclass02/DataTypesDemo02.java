package com.syntax.reviewclass02;

public class DataTypesDemo02 {
public static void main(String[] args) {
	//simple if statement
	 
	boolean isRaining=false;
	if(isRaining) {
		System.out.println("I will take the umbrella");
	}
	// if else statement
	boolean isRaining1=false;
	if(isRaining1) {
		System.out.println("take the umbrella");
	}else {
		System.out.println("Don't take umbrella");
	}
	System.out.println("********************************************************");
	// real time exaple
	boolean buttonIsDisplayed=true;
	if(buttonIsDisplayed) {
		System.out.println("Login BTN is enabaled");
	}else {
		System.out.println("Login BTn is disabled");
	}
	
	System.out.println("********************************************************");
	//if else ladder. Alex, Malika, Ummar
	 String name="xyz";
	 if(name.equals("Alex")) {
		 System.out.println("User logged as Alex");// "name.equals" - the variable equals with or "name=...."
	 }else if(name.equals("Malika")) {
		 System.out.println("User logged in as Malika");// == is not for strings, but primitives
	 }else if(name.equals("Ummar")) {
		 System.out.println("User is logged in as Ummar");
	 }else {
		 System.err.println("Unkonwn User");   //if want something to print out in red color write "err" instead "out"
	 }
	
	
	
	//always two curly brackets at the end to be in the main method
}
}
