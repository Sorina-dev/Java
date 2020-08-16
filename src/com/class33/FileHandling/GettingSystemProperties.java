package com.class33.FileHandling;

public class GettingSystemProperties {
	public static void main(String[] args) {
       // the whole path
		//C:\Users\crist\eclipse-workspace\JavaBasics\configs\Example.properties
		
	String username =System.getProperty("user.name"); //username from the computer
	System.out.println(username);
		
	String os =System.getProperty("os.name");//windows name
	System.out.println(os);
		
	String timezone =System.getProperty("user.dir");//location from which program java get executed
	System.out.println(timezone);
	
	//niceer way to write the file path
	
	String filePath = System.getProperty("user.dir")+"\\configs\\Example.properties";//this way we will be using asking the path of the file
	//have to check
	
	
	}
}
