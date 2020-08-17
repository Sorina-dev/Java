package com.class34.ExcelHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcelIntoMap {
public static void main(String[] args) throws IOException {
		
		String xlFilePath=System.getProperty("user.dir")+"\\testdata\\DataForExample.xlsx";
		
		FileInputStream fis=new FileInputStream(xlFilePath);
		//create an Object of Workboook
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1");
		//Get number of rows and cols
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getPhysicalNumberOfCells();
		//create an empty List
		List<Map<String, String>> xlList=new ArrayList<>();
		
		//loop over rows
		for(int r=1; r<rows; r++) {
			//for every row create a new Map
			Map<String, String>map=new LinkedHashMap<>();
			//loop over every column
			for(int c=0; c<cols; c++) {
				//get keys from 1 row (header)
				String key=sheet.getRow(0).getCell(c).toString();
				//get values from other rows
				String value=sheet.getRow(r).getCell(c).toString();
				//store values from each cell of the row into a map
				map.put(key, value);
			}
			//add created map with values into List
			xlList.add(map);
		}
		
		System.out.println(xlList);
		
		System.out.println(" -------  Printing maps 1 by 1 from our List ------  ");
		for(Map<String, String> littleMap:xlList) {
			System.out.println(littleMap);
		}
		
		//extract data from username and Password excel and store inside List of Maps
	}
}
