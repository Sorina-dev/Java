package com.class34.ExcelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Manually create a file to store username and password0
Using Java add 2 more lines for username and password 
Save code in the same file
 */
public class Task {

	public static void main(String[] args) throws IOException {
	String file = System.getProperty("user.dir") + "\\testdata\\MyCredentials.xlsx";

		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		sheet.createRow(2).createCell(0).setCellValue("Maria");
		sheet.getRow(2).createCell(1).setCellValue("Maria242");
		sheet.createRow(3).createCell(0).setCellValue("Ivan");
		sheet.getRow(3).createCell(1).setCellValue("Ivan461");

		FileOutputStream fos = new FileOutputStream(file);

		workbook.write(fos);
		// workbook.close();
		// fos.close();

	}

}
