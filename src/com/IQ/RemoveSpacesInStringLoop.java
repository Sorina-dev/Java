package com.IQ;

public class RemoveSpacesInStringLoop {
	public static void main(String[] args) {

		/**
		 * Remove White Spaces From String using loop
		 */
		String str = "Enter input string to be cleaned from white spaces...!";

		char[] charArray = str.toCharArray();

		String stringWithoutSpaces = "";

		for (int i = 0; i < charArray.length; i++) {

			if ((charArray[i] != ' ') && (charArray[i] != '\t')) {
				stringWithoutSpaces = stringWithoutSpaces + charArray[i];
			}
		}

		System.out.println("The String was : " + str);
		System.out.println("The String without spaces is : " + stringWithoutSpaces);
		// --------------------------------------------------------------------------------------

		/**
		 * remove White Spaces From String using build-in methods
		 */

		String str1 = " My mom is nice person. ";

		String stringWithoutSpaces1 = str1.replaceAll("\\s+", "");

		System.out.println("The String was : " + str1);
		System.out.println("The String without spaces is : " + stringWithoutSpaces1);

	}

}
