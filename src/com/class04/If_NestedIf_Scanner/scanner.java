package com.class04.If_NestedIf_Scanner;

import java.util.Scanner;

public class scanner {
  public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);//means read somth from the console // write it first then click enter on the java.util.Scanner
	
	System.out.println("please writee some code and press enter");
	String text = scan.nextLine();  //  will read one line from the console  ////memorize
	System.out.println("*************************");
	System.out.println(text);                                                ///then in order to print 
	                                 //type in console and click enter
	// int a = (int) "thirty three"; or 33.4-->compile time error
	// read an int (age)
	System.out.println("Please enter age!It should be a number");
	int age = scan.nextInt();       // if not an integer, run time error
	System.out.println("The age that you entered is "+ age);
	
	}
}


