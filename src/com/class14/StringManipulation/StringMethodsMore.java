package com.class14.StringManipulation;

public class StringMethodsMore {
	public static void main(String[] args) {
		
		System.out.println("-------------- .charAt() method ----------------------");
		
		String season = "Summer";
		char character = season.charAt(4);
		System.out.println(character);
		
		System.out.println("-------------- .indexOf() method -----------------");
		
		int index = season.indexOf('m');
		System.out.println(index);
		
		String hello = "Hello Ksenia";
		int indexOfKsenia = hello.indexOf("Ksenia"); // the 1st character of the word
		System.out.println("Index of Ksenia in the string "+ hello + " is = "+ indexOfKsenia);
		
		System.out.println("----------- .subtring() method ------------------");
		
		String message = "You guy are awesome";
		String newMessage = message;
		System.out.println(newMessage);
		
		String substring = message.substring(4); //take String starting from Index 4
		System.out.println(substring);
		
		String middleWord = message.substring(4, 7); //take String starting from index 4 ending at index 7
		System.out.println(middleWord);
		
	}

}
