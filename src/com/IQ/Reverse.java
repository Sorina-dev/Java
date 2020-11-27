package com.IQ;

public class Reverse {

	public static void main(String[] args) {
		
		/**
		 * Using Reverse Function:
		 */
		
		//StringBuffer
		 String a= "Hello Syntax";
		 StringBuffer sb=new StringBuffer(a);
		 System.out.println(sb.reverse());
		 
		/**
		 *  Without Using Reverse Function:
		 */
		 String toReverse="Hello World";
		 
		// 1 way using charAt();
		String reversed="";
		for (int i=toReverse.length()-1; i>=0; i--) {
		reversed=reversed+toReverse.charAt(i);
			 }
		System.out.println("Reversed String is: "+reversed);
		
		//2 way using to charArray();
		String reversed1 ="";
		char[] array =toReverse.toCharArray();
		for (int i=array.length-1; i>=0; i--) {
		reversed=reversed+array[i];
		}
		System.out.println("Reversed String is: "+reversed);
		
		/**
		 * Reverse a string word by word
		 */
		
		String sentence = "Todays is Sunday";
		String reversed2 = "";
		String[] array1 = sentence.split(" ");
		for (int i = array1.length - 1; i >= 0; i--) {
		reversed = reversed + array[i]+" ";
		}
		System.out.println(reversed);
		
		
	}
}
