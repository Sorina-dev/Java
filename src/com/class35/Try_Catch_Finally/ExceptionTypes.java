package com.class35.Try_Catch_Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypes {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		// Checked exceptions are checked by the Compiler

		// Thread.sleep(2000); //checked exception as the compiler checks it

		String filePath = System.getProperty("user.dir") + "\\testdata\\DataForExample.xlsx";
		FileInputStream fis = new FileInputStream(filePath); // when working with file there might always be exception
																// so the compiler checks
		// and makes us aware that FileNotFoundException

		// Unchecked exceptions are not checked by the Compiler
		int a = 12;
		int b = 0;
		System.out.println(a / b);// compiler doesn't say or predict it wont say anything ;// ArithmeticExceptions

		String str = null;
		System.out.println(str.length());

	}

}
