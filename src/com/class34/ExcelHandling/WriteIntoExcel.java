package com.class34.ExcelHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {
//getting data from existing file and writting into new one
		String xlFilePath = System.getProperty("user.dir") + "\\testdata\\SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);

		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sample");
		sheet.getRow(0).createCell(5).setCellValue("Result");
		sheet.getRow(1).createCell(5).setCellValue("Pass");
		sheet.getRow(2).createCell(5).setCellValue("Fail");
		sheet.createRow(3).createCell(0).setCellValue("We are done !!!");
		
		String newXl = System.getProperty("user.dir")+"\\testdata\\Results.xlsx";
		
		FileOutputStream fos = new FileOutputStream(newXl);
		
		workbook.write(fos); //for excel to write
		//if java wont complain after running, make refresh and check the new xlsx file
		
		//if we want to write a new totallly file, we dont need line 18
		workbook.close();
		fos.close();

	}
}
