package com.class14.StringManipulation;

public class StringMethodsContinue {
public static void main(String[] args) {
	System.out.println("-------------- .contains() method --------------------");
	//checks if String contains another sequence of specified characters
	
	String str = "Good afternoon All";
	boolean contains = str.contains("afternoon");
	System.out.println(contains); //true
	
	String searchValue = "good";
	boolean isItThere= str.contains("good");
	System.out.println(isItThere);
	
	System.out.println(str.contains("A"));
	System.out.println(str.contains("after "));
	
	System.out.println("---------- .startsWith() method -----------------");
	
	String drink = "Welcome students";
	boolean starts = drink.startsWith("Welcome");
	System.out.println(starts);
	
	System.out.println("----------------- .endsWith() method --------------");
	
	boolean ends = drink.endsWith("a");
	System.out.println(ends);
	
	//drink.startsWith('W'); //we need to check if it starts with specified String, cannot be just char
	
	String str1 = "Hello Mohammad";
	String str2 = "Hello Bulat";
	
	System.out.println("String "+ str1 +" "+ str1.startsWith("Hello"));
	System.out.println(str2.endsWith("Bulat"));
	
	System.out.println("----------------- .equals() method -----------------------");
	
	String string1 = "Saturday";
	String string2 = "saturday";
	
	boolean equality = string1.equals(string2);
	System.out.println(equality);
	
	System.out.println("------------- .equalsIgnoreCase() method -----------------");
	
	boolean equalityNoCase = string1.equalsIgnoreCase(string2);
	System.out.println(equalityNoCase);
	
	System.out.println("-----------Real example of equals---------------");
	
	String expected = "Password cannnot be empty";
	String actual = "password cannot be empty";
	
	if(expected.equals(actual)) {
		System.out.println("test pass");
	}else {
		System.out.println("test fail");
	}
	
	System.out.println("-----------Real example of equalsIgnoreCase-------------");
	
	String expectedBrowser = "Chrome";
	
	if (expectedBrowser.equalsIgnoreCase("chrome")) {
		System.out.println("Test executed on chrome browser");
	}else {
		System.out.println("Test executed Not on chrome browser");
	}
	
}
}
