package com.class34.ExcelHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {
	public static void main(String[] args) throws IOException {

        String xPath = System.getProperty("user.dir")+"\\testdata\\practice.xlsx";
        
        FileInputStream fis = new FileInputStream(xPath);
        Workbook book = new XSSFWorkbook(fis);
        Sheet sheet =  book.getSheet("Sheet1");
       
        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();
        
        List<Map<String, String>> xList = new ArrayList<>();
        
        for(int r = 1; r<rows; r++) {
        	Map<String,String> map = new LinkedHashMap<>();
        	for(int c = 0; c<cols; c++) {
        		String key =sheet.getRow(0).getCell(c).toString();
        		String value = sheet.getRow(r).getCell(c).toString();
        		map.put(key,value);
        	}
        	xList.add(map);
        }
		System.out.println(xList);
		
		for(Map<String, String> map :xList) {
			System.out.println(map);
		}
		String xPath1 = System.getProperty("user.dir")+"\\testdata\\practice1.xlsx";
		FileOutputStream fos = new FileOutputStream(xPath1);
		sheet.getRow(0).createCell(2).setCellValue("Birthday");
		sheet.getRow(1).createCell(2).setCellValue("26.10.13");
		sheet.getRow(2).createCell(2).setCellValue("20.01.87");
		sheet.getRow(3).createCell(2).setCellValue("01.10.88");
		sheet.getRow(4).createCell(2).setCellValue("04.11.59");
		sheet.getRow(5).createCell(2).setCellValue("03.05.66");
		

		book.write(fos);
		
		
		
		
	}	
}
