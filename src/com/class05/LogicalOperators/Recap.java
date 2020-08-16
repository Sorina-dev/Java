package com.class05.LogicalOperators;

import java.util.Scanner;

public class Recap {
public static void main(String[] args) {
	Scanner myScanner=new Scanner(System.in);
	
	System.out.println("Please write a long text");//  girl is waiting for you
	String text1 = myScanner.next();
	System.out.println(text1);   //girl
	
	System.out.println("Please write a long text");
	String text2 = myScanner.next();
	System.out.println(text2);  //waiting
	
	System.out.println("Please write a long text");
	String text3 = myScanner.next();
	System.out.println(text3); //is
	
	System.out.println("Please write a long text");
	String text4 = myScanner.nextLine(); //waiting for you
	System.out.println(text4);
	System.out.println("**************************");
	// we can put numeric answers in the same row: 20, 20,0, true Aidana, and Java reads exactly as before
	System.out.println("Please enter an integer");
	int num = myScanner.nextInt();
	System.out.println(num);
	
	System.out.println("Please enter a double");
	double d = myScanner.nextDouble();
	System.out.println(d);
	
	System.out.println("Please enter if Aidiana is happy:true/false");
	boolean b = myScanner.nextBoolean();
	System.out.println(b);
	
	System.out.println("Please enter Aidiana's name");
	char myChar=myScanner.next().charAt(0);
	System.out.println(myChar);
	
}
}
