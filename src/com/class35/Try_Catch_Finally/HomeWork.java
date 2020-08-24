package com.class35.Try_Catch_Finally;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/*
 * Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.
 */
public class HomeWork {
	//List <Exception> exceptionList = new ArrayList<>();
static List<Exception> exceptions(){
	List <Exception> exceptionList = new ArrayList<>();
		//1st
		try {
			int[] numbers= {1,2,3};
		}catch(Exception e1) {
			exceptionList.add(e1);
		}
		//2nd
		try {
			int a = 10;
			int b = 0; 
			System.out.println(a/b);
		}catch(Exception e2) {
			exceptionList.add(e2);
		}
       //3rd
		try {
			String str = null;
			System.out.println(str.length());
		}catch(Exception e3) {
			exceptionList.add(e3);
			
		//4th
			String filePath = System.getProperty("user.dir")+ "\\SampleTestData.xlsx";
		try {
			FileInputStream fis = new FileInputStream(filePath);
		}catch(Exception e4) {
			exceptionList.add(e4);
		}	
		
		return exceptionList;
		}
		return exceptionList;
}
public static void main(String[] args) {
	
	List<Exception> exceps = exceptions();
	for(Exception ex : exceps) {
		System.out.println(ex);
	}
}

}
