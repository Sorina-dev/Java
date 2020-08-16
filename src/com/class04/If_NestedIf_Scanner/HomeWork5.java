package com.class04.If_NestedIf_Scanner;

import java.util.Scanner;

public class HomeWork5 {
public static void main(String[] args) {
	
	//You are DMV representative and you need to ask customer their age. 
			//If they are 18 and older you will issue a driver licence to them
			//otherwise you will offer them to get a learners permit.
			Scanner age = new Scanner(System.in);
			
			System.out.println("Please enter your age!");
			int x=age.nextInt();
			if(x>=18) {
				System.out.println("Your driver licence will be issued");
			}else {
				System.out.println("You are offered a learner's permit");
}
}}
