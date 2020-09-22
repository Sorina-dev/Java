package com.class36.Exceptions_Throw_throws;

public class ThrowKeyword {
	  public static void main(String[] args) {
	        print(null);
	        print("Kamila");

	    }



// the purpuse of throw is to throw an exception for unchecked exceptions and the message we want to display
	  //we can create this way our own excetions by extending them from Exceptions class
	    public static void print( String name) {

	        if(name==null){
	            throw  new NullPointerException(" String cannot be null");
	        }else {
	            System.out.println(name.length());

	        }

	    }
}
