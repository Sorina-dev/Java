package com.class33.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {
	public static void main(String[] args) throws IOException {

		//writing in the existing file, we should add the data that we already have then make changes
		String file = "configs\\Example.properties";
		
		FileInputStream fis = new FileInputStream(file);
		Properties p = new Properties();
		p.load(fis);
	
		//append/add more values 
      p.setProperty("street", "New Brook Drive");//add in java file it is not in property file yet
      
      //create an object of FileOutputStream in order to be pushed to .property file
      //specifing path for different file
      String newFile = "configs\\NewFile.properties";
      
      //if file is not there it will be created
      FileOutputStream fos = new FileOutputStream(newFile);//select project /refresh/new file added
     // FileOutputStream fos = new FileOutputStream(file); //writting into the existing file
      p.store(fos, "Added additional key");

	}
}
