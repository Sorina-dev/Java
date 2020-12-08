package com.IQ;

public class P {
public static void main(String[] args) {
	
	
 		try{
     System.out.println("Star" + 1/0);
     } catch(ArithmeticException e) {
     	System.out.println("Sun");
     }
	
}
}
