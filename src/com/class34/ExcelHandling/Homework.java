package com.class34.ExcelHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	public static void main(String[] args) throws IOException, InterruptedException {

		String XLFile = System.getProperty("user.dir") + "\\testdata\\CredentialsForEmployeesHW.xlsx";
		FileInputStream fis = new FileInputStream(XLFile);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> listOfMap = new ArrayList<>();

		for (int r = 1; r < rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int c = 0; c < cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);

			}
			listOfMap.add(map);
		}

		System.out.println(listOfMap);

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();

		for (Map<String, String> map : listOfMap) {
			Set<String> user = map.keySet();
			for (String user1 : user) {
				String password = map.get(user1);
				Thread.sleep(3000);
				WebElement usernameField = driver.findElement(By.id("txtUsername"));
				Thread.sleep(1000);
				WebElement passwordField = driver.findElement(By.id("txtPassword"));
				usernameField.sendKeys(user1);
				passwordField.sendKeys(password);
				Thread.sleep(1000);
				driver.findElement(By.id("btnLogin")).click();
				Thread.sleep(1000);

				WebElement welcome = driver.findElement(By.id("welcome"));
				Thread.sleep(1000);
				String welcomeText = welcome.getText();
				System.out.println(welcomeText);
				welcome.click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("a[text()='Logout']")).click();

			}
		}

	}
}
