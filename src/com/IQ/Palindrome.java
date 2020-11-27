package com.IQ;

public class Palindrome {

	public static void main(String[] args) {

		/**
		 * A palindrome is a word, number, phrase, or other sequence of characters which
		 * reads the same backward as forward, such as "madam", "racecar", "radar", "deed", "wow", "dad", "eye". There are also
		 * numeric
		 */
		// declare and initialize a string
		String original = "hellhe";
		String reverse = "";
		//using for loop to reverse the string by char
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		//condition if the original string equals reversed
		if (original.equals(reverse)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is NOT Palindrome");
		}

	}
}
