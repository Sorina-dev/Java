package com.class35.Try_Catch_Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_Catch {

	public static void main(String[] args) {
		
		String xlFilePath = System.getProperty("user.dir") + "\\SampleTestData.xlsx";
		
		try { //code might throw an exception 
		FileInputStream fis = new FileInputStream(xlFilePath); 
		
		}catch (FileNotFoundException fne) { //catching the right exception
			System.out.println("I cought the execution");  //its gonna execute only if there is no exeptions
		}
		System.out.println("End of the code");
		
		System.out.println("-----------------------------------------------------");
		int[] array = {10,20,30};
		
		try {
		System.out.println(array[3]);
		
		}catch (ArrayIndexOutOfBoundsException aiob) { // if we put a different exception, then the Object
			//of expetion wont be cauught but and in the runtime will be shown the exception
		
			System.out.println("I caught Array Index Out Of Bounds Exception ");
		}
		System.out.println("end of code");
		System.out.println("------what will be executed if there is exception and being caught---------");
	int[] array1 = {10,20,30};
		
		try {
			System.out.println("the beginning of the try block"); //will execute
		System.out.println(array[3]); //exception object , won't execute
		System.out.println("the end of the try block"); //won't execute after the exception object
		
		}catch (ArrayIndexOutOfBoundsException aiob) { 
			System.out.println("the beginning of the catch block");//will execute
			System.out.println("I caught Array Index Out Of Bounds Exception "); //will execute
			System.out.println("the end of the catch block");//will execute
		}
		System.out.println("end of code");//will execute
		// if there is no exception it would print everything in try block of code and move out of trycatch block of codes
		
		

	}
	

}
