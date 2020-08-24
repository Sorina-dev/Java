package com.class35.Try_Catch_Finally;

public class CatchingException {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		 try {
			 System.out.println(a/b);
			 //throw new ArithmeticException();
		 }catch(ArithmeticException ae) {//or to RunTimeException (parent), or Exception(grandparent), or Throwable(grandgrandparent
			 //ArithmeticException ae = new ArithmeticException(); //object will be assigned
			 ae.printStackTrace();
			 //or
			// System.out.println(ae.getMessage()); //it returns a String, thats why need to be printed
			//or
			//System.out.println(ae);
		 }
		System.out.println("End of the code");

	}

}
