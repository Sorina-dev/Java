package com.syntax.class03;

public class ElseCondition {

	public static void main(String[] args) {
		double num1 = 10.7;
		double num2 = 10.7;
		 
		if (num1>num2) {
			System.out.println("number1 is larger then number 2");//although they are equal
		}else if (num1<num2){
			System.out.println("number 1 is smaller then number2");
		}else {
			System.out.println("numbers are equal");
		System.out.println("----------------------Different way----------------------------");
		}
		
		if (num1>num2) {
			System.out.println("number1 is larger then num2");
		}else if(num1<num2) {
			System.out.println("number1 is smaller then number2");
		}else if(num1!=num2) {
			System.out.println("numbers are equal");
		}else {
			System.out.println("you will never come here");
			System.out.println("we are done");
		}
		
		
	}

}
