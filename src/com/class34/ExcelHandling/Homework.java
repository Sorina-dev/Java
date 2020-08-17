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

/*
 * Test Login functionality with 5 different usernames:

Using Automation Code:

Login to the application using Data from XL File
Verify welcome message displays correct user that logged in

Precondition:
Manually Create 5 different username and passwords and Store data inside XLFile
URL=http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
username: Admin
password: Hum@nhrm123
 */

public class Homework {
public static void main(String[] args) throws IOException {
	
//	 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
//	  WebDriver driver = new ChromeDriver();
	
//	driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
	
//	WebElement usernameField = driver.findElement(By.id("txtUsername")).sendKeys(value);
//	String usernameText = usernameField.getText();
//	driver.findElement(By.id("txtPassword")).sendKeys(value);

//	driver.findElement(By.id("btnLogin")).click();
//	String welcomeText = driver.findElement(By.id("welcome")).getText();
//	boolean correctMessage = welcomeText.equals(usernameText);
//	if(!correctMessage) {
//		System.out.println("Welcome message is not displayed correctly");
//	}else {
//		System.out.println("Welcome message is displayed correctly");
//	}
	
	String XLFile = System.getProperty("user.dir")+"\\testdata\\CredentialsForEmployeesHW.xlsx";
	FileInputStream fis = new FileInputStream(XLFile);
	Workbook book = new XSSFWorkbook(fis);
	Sheet sheet = book.getSheet("Sheet1");
	int rows = sheet.getPhysicalNumberOfRows();
	int cols = sheet.getRow(0).getPhysicalNumberOfCells();
	
	List<Map<String, String>> ListOfMap = new ArrayList<>();
	
	for(int r =1; r<rows; r++) {
		Map<String, String> map = new LinkedHashMap<>();
		for(int c = 0; c<cols; c++) {
			String key = sheet.getRow(0).getCell(c).toString();
			String value = sheet.getRow(r).getCell(c).toString();
			map.put(key, value);

		}
		ListOfMap.add(map);
	}
	
	System.out.println(ListOfMap);
	
	
}
}
