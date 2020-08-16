package com.class25.FinalKeyword;

public class DriverTest {
public static void main(String[] args) {
	
	
			WebDriver driver=new InternetExplorerDriver();
			driver.open(); //run time polymorphism, by changing the Object name only we can access 
		}                  // the same method if there would be many for all the objects we have
}
class WebDriver {

	public void open() {
		System.out.println("Opening browser");
	}
}
class FirefoxDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening firefox browser");
	}
}

class ChromeDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorerDriver extends WebDriver {
	
	public void open() {
		System.out.println("Opening internet explorer");
	}
}
