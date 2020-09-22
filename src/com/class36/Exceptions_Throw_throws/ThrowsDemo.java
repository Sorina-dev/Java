package com.class36.Exceptions_Throw_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
	  public static void main(String[] args)   {

	        FileInputStream fileInputStream = null;

	        try{
	            fileInputStream = new FileInputStream("C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaReviewBatch7review\\Ali2.xls");


	        }catch (Exception e){
	            System.out.println("accessing the backup file ");
	        }
	        System.out.println("last line");


	    }
// if we have many methods and instead writing try catch block everytime we can throws the method in the method signature 
//and create a method to call all the other methods and put the try catch block and name the exception, so we reduce the code	  
	  

	    public static void readData(){ // just one try catch block to handle all three exceptions for the methods and the methods used with throws exception to reduce the so many try catch blocks
	        try {
	            readExcelFileData();
	            readTextFileData();
	            readXMLFileData();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

	    public static void readExcelFileData() throws IOException { 

	        FileInputStream fileInputStream = null;
	        try {
	            File file= new File("\"C:\\\\Users\\\\Asghar Nazir\\\\IdeaProjects\\\\JavaReviewBatch7review\\\\Ali.xls\"");
	            if(!file.exists()){
	                throw new FileNotFoundException("Sorry this file does not exits ");

	            }
	            fileInputStream=new FileInputStream("C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaReviewBatch7review\\Ali.xls");

	        }finally {
	            fileInputStream.close();

	        }


	    }

	    public static void divide(int num1 ,int num2){
	        if(num2==0){
	            throw new ArithmeticException("number2 can not be 0" +(num1/num2));
	        }
	    }

	    public static void readTextFileData() throws FileNotFoundException { //

	        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaReviewBatch7review\\Ali.xls");


	    }
	    public static void readXMLFileData() throws FileNotFoundException {

	        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaReviewBatch7review\\Ali.xls");


	    }
}
