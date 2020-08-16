package com.class33.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {

	public static void main(String[] args) throws IOException {

	//need to specify the path for the file to find out the file for credentials
		//we can put the properties file path by copying it all
		//or from the name of the file:"configs\\Example.properties"
		
		//1.identify to the file path you would like to read
		//String filePath="configs\\Example.properties";
		
		String filePath = System.getProperty("user.dir")+"\\configs\\Example.properties";
		//2.create an object of FileInputStream class
		FileInputStream fis = new FileInputStream(filePath);//import it and add throws in case
		//java won't find it
		
		//3.will be different code it depends of the files
		//to work with property file we need to use Property class in Java, so Create Object of Properties Class to access the property file.
		Properties prop = new Properties();
		prop.load(fis); //loading the inputStream and add throws
		
		String value1 = prop.getProperty("username"); //we want to retrieve the value of the key
		System.out.println(value1);
		
		String value2 = prop.getProperty("city");//getProperty gives back only Strings
		System.out.println(value2);
		
		String value3 = prop.getProperty("password");
		System.out.println(value3);
		
		String value4 = prop.getProperty("company");
		System.out.println(value4);
		
		String value5 = prop.getProperty("address");
		System.out.println(value5);
		
	//	fis.close();
	}
}
