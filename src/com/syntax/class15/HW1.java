package com.syntax.class15;

public class HW1 {
public static void main(String[] args) {
/*
 * 	
 */
   String str = "AAb";
   int size = str.length(); //3
   
   if(!str.isEmpty()) {
	   if (size >= 3) {
		   if (size % 2 != 0) {
			   int print = (size /2); //3/2= 1
			   System.out.println(str.charAt(print));
		   }else {
			   System.out.println("This string has an even of characters");
			   
		   }
	   }
   }else {
	   System.out.println("This String has less then 3 characters");
   }
}
}
