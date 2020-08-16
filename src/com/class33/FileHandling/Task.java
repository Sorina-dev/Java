package com.class33.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Create a property file to store following configurations:

browser=chrome
url=https://facebook.com
username
password

Read file and extract values of browser & url
 */
public class Task {
public static void main(String[] args) throws IOException {
	
	String filePath="configs\\Task.properties";
	FileInputStream fileInput = new FileInputStream(filePath);
	Properties p = new Properties();
	p.load(fileInput);
	
	String v1 = p.getProperty("browser");
	String v2 = p.getProperty("url");
	String v3 = p.getProperty("username");
	String v4 = p.getProperty("password");
	
	System.out.println(v1+ "; " + v2+"; "+ v3+" ;"+v4);
	
}
}
