package com.class15.StringMethods_StringBuffer;

public class Task {
public static void main(String[] args) {

	//one of the IQ
	String str="ggiugiug 86868 69*()@@!!";
	
	str=str.replaceAll("[^A-Za-z]", "");

	System.out.println(str.length());
	
	String a ="1.Is it saturday 2.Is it raining 3.Do we have a Java Class today?";
	String[] array = a.split("[0-9]");
	
	int sentences = array.length;
	
	System.out.println("Total number of sentences is " + sentences);
	
	//Create a String that will hold a sentence. 
	//Write a program to get a new String without any spaces.
	
	String sen = "I love watching movies";
	String sen1 = sen.replace(" ","" );
	System.out.println(sen1);
	
	/*Create a String that should be combination of letters, 
	 * numbers and special characters. Find out how many alpha characters
	 *  are there in the String.
	 */
	String all = "Sorina200187&^%%$$#@";
	all = all.replaceAll("[^A-Za-z]", "");
	System.out.println(all);
	System.out.println(all.length());
	
	//You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?” 
	// How would you find out how many sentences are in that String?

	String b= "Is it June? Is it warm? Do we have a pool party?";
	String[] b2 = b.split("[?]");
	int sentance = b2.length;
	System.out.println("There are " + sentance + " sentances");
	
	
}
}
