package com.class36.Exceptions_Throw_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {
	public static void main(String[] args) {

       //if we won't use try and catch, the other lines after the exception won't be executed
		//using try and catch it will execute all the lines and the exception info will be shown too
        System.out.println("Line number 1");
        System.out.println("Adding two numbers" + (10 + 5));

        File file = new File("C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaReviewBatch7review\\Book1.xlsx");

//here are still chances the code will show exception with using if else statement these are the checked exceptions shown by compiler
        try {
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("File exits");
        
   // here we can handle it using the if else statement so it is for unchecked exceptions that are shown during the runtime if not handled     
        int arr[] = {10, 20};
        int index = 10;
        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);

        } else {
            System.out.println("index out of bound");
        }


        System.out.println("Adding two numbers" + 10 + 5);//starting with a string --> Adding two numbers105
        System.out.println("Last line ");
        System.out.println("1000");


    }
}
