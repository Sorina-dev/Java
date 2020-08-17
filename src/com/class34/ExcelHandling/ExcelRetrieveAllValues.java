package com.class34.ExcelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRetrieveAllValues {
	public static void main(String[] args) throws IOException {
      
		String xlFilePath = System.getProperty("user.dir")+"\\testdata\\SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);
		
		Workbook workbook = new XSSFWorkbook(fis);//if using XSSFWorkbook class then every were should put XSSFSheet, XSSFRow, XSSFCell...
		
		Sheet sheet = workbook.getSheet("Sample");
		Row row2 = sheet.getRow(1);
		String cellValue = sheet.getRow(1).getCell(3).toString();
		System.out.println(cellValue);
		
		//how to get values from all rows and all columns
		//1.get number of rows
		int  rows = sheet.getPhysicalNumberOfRows();
		
		//get number of columns
		int cols = sheet.getRow(0).getLastCellNum();
		
		for(int r = 0; r<rows; r++) { //iterates over rows
			for(int c = 0; c<cols; c++) { //iterates over columns
				String value = sheet.getRow(r).getCell(c).toString();
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
	}
}
