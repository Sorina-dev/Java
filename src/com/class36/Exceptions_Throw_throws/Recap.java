package com.class36.Exceptions_Throw_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Recap {

	 public static void main(String[] args) throws FileNotFoundException {
	       /*
	        what are exceptions an unwanted undesired event that disrupts the normal flow of program
	        */


	        System.out.println("Line one");
	        int num1=10;
	        int num2=0;

	       if(num2==0){
	           System.out.println("bad input");
	       }else{
	           System.out.println(num1/ num2);

	       }
	        System.out.println(num1/ num2);
	        



	        int arr[]={10,20};
	        int index=2;
	        try{
	            System.out.println("Value at index "+index+" Value"+ arr[index]);

	        }catch (Exception e){

	        }
     

	        if(index>=0 &&index<arr.length){
	            System.out.println("Value at index "+index+" Value"+ arr[index]);

	        }else {
	            System.out.println("Index is out of range");
	        }

	        String name="syntax";

	        if(name==null){
	            System.out.println("String is null");
	        }else {
	            System.out.println(name.length());
	        }



	        try {
	            doCalculation();

	        }catch (Exception e){
	            e.printStackTrace();
	        }

	        System.out.println("Last line");

	        File file=new File("C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaReviewBatch7review\\Book1.xlsx");
	        if(file.exists()){
	            FileInputStream fileInputStream=new FileInputStream(file);
	            System.out.println("File exits");
	        }else {
	            System.out.println(" file does not exists");
	        }


	        /*
	         * advantages of using try and catch block 
	        1)standard way of representing the issue understandable to everyone, it shows it in the console
	        2)Complete information about the issue like class name method name line number
	        3)while with if else, it will just print what we input there to do if is right or wrong
	        4) if else  there will still be chances we still get exceptions, like reading the files
	         */




	    }


	    public static void doCalculation(){
	        doDivision();
	    }

	    public static void doDivision(){
	        System.out.println(10/0);
	    }

}
