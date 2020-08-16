package com.class33.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlReadingDemo {
public static void main(String[] args) throws IOException {
	  // String xlPath="testdata\\SampleTestData.xlsx";
		String xlPath=System.getProperty("user.dir")+"\\testdata\\SampleTestData.xlsx";
		
		FileInputStream fis=new FileInputStream(xlPath);
		
		//workbook is a interface for XSSWorkbook class to be easier we write it
		Workbook workbook=new XSSFWorkbook(fis);
		
		//access the sheet and name of it
		Sheet sheet=workbook.getSheet("Sample");
		
		//access the row and the index of object Row type
		Row row1=sheet.getRow(0);
		
		//access the column , here is cell, by index of object Cell type
		Cell row1Cell3=row1.getCell(2);
		
		//covert it to String
		String value=row1Cell3.toString();
		
		System.out.println(value);//LastName
		
		Row row2=sheet.getRow(1);
		
		String valueOfAnotherCell=row2.getCell(0).toString(); // in one line access and covert into string
		System.out.println(valueOfAnotherCell);
		
	}

}
