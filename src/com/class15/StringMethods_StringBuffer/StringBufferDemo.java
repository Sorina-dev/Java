package com.class15.StringMethods_StringBuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		
	

	StringBuffer strBuffer = new StringBuffer("Hello");//is a mutable object
	
	strBuffer.append("friends"); //when we perform the operation it happens on same Object and No new Objects gets created
	
	System.out.println(strBuffer); //Hello friends
	
	String str2 = "Hello";
	str2.concat("firends");
	
	System.out.println(str2); //Hello
	
	}
}
