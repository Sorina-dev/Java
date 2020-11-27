package com.IQ;

public class AlphaCharactersPresentInAStringAndNumberOfWordsInString {

	public static void main(String[] args) {
		/**
		 * Number of alpha characters in a String
		 */
		
		 // declare and initialize the string
		 String str=" Hih9898jhjh%%^$%^ oio ";
		 // replace non-alpha characters with spaces
		 str=str.replaceAll("[^A-Za-z]", "");
		 // string length number
		 int number=str.length();
		 // print the number of alpha characters
		 System.out.println("Number of alpha character = "+number);
		 
		 /**
		  * Number of words in String
		  */
		 
		 //declare and initialize a String
		 String myString="Today is Wednesday and it is Java Class";
		 //split the string and get an array
		 String[] array=myString.split(" ");
		 //array length number
		 int words=array.length;
		 //print the array length number
		 System.out.println("Total words in string:"+myString+" = "+words);
		
	}
}
