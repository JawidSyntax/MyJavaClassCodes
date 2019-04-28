package com.class29;

public class Test {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.closeBrowser();
		driver.findElement();
		driver.execute();
		driver.openBrowser();
		driver.takeScreenShot();
		driver.maximizeWindow();
		TakesScreenShot.m1(); //access static method in static way by using class name/interface where method is defined
		System.out.println(TakesScreenShot.fileExecution);
		
	}

}
