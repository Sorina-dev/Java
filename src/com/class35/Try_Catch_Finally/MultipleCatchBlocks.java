package com.class35.Try_Catch_Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		String file = "";

		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String file1 = System.getProperty("user.dir") + "\\testData\\SampleTestData.xlsx";

		try {
			FileInputStream fis = new FileInputStream(file1);
			// fis.close();    this way only IOexeption will be executed, otherwise the
			// FileNotFound
			Workbook wb = new XSSFWorkbook(fis);
			// when we have 2 or more catches
			// always start with specific catch , after the parent, to the generic
		} catch (FileNotFoundException e) {// child of IOException
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// when a catch can never be executed --> compiler says it is unreachable
		// catch,

	}

}
