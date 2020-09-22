package com.class36.Exceptions_Throw_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FinallyBlock {
	 public static void main(String[] args) throws IOException {
	        System.out.println("");

	        FileInputStream fileInputStream = null;
	        System.out.println("line above the division");
	        try {
	             fileInputStream = new FileInputStream("C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaReviewBatch7review\\Book1.xlsx");
	            System.out.println(10/0);
	            System.out.println("line below the division");
	        } catch (IOException e) {
	            System.out.println(" in the catch block");
	            e.printStackTrace();
	        }
	        catch (ArithmeticException e){
	            System.out.println("My code to handle the arithmetic exception");
	        }
	        finally {//it is used in cases when we anyway have issues of catching the exception, so we need to make the finally cuz it always executes
	            fileInputStream.close(); //we always should close it in oder to make changes or to delete it

	        }

	        File file = new File("C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaReviewBatch7review\\Book1.xlsx");
	        file.renameTo(new File("Ali.xls"));
	    }
}
