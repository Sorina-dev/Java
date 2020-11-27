package com.class35.Try_Catch_Finally;

public class FinallyBlock {

	public static void main(String[] args) {

		String str = "Java";
		try {
			System.out.println("I am a try block");
			char letter = str.charAt(0);//
			char letter1 = str.charAt(10);// the exception, so catch block will be executed,other wise just J and try
											// code
			System.out.println(letter);
		} catch (Exception e) {
			System.out.println("I am a catch block");
			System.out.println(e);
		} finally {
			System.out.println("I am finally block");// will always be executed
		}
		System.out.println("I am the end of the code");
	}
//if there woulnd't be the catch block, then the line 9, 10, 18 only will be executed plus exception thrown
	// so start until exception, then finally block only, the program stops due to
	// the exception

}
