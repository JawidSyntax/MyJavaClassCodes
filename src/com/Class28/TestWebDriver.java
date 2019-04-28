package com.Class28;

public class TestWebDriver {
	
	public static void main(String[] args) {
		
		
		ChromeDriver ch = new ChromeDriver();
		ch.closeBrowser();
		ch.findElement();
		ch.openBrowser();
		ch.maximizeWindow();
		
		FirefoxDriver fx = new FirefoxDriver();
		fx.closeBrowser();
		fx.findElement();
		fx.openBrowser();
		fx.maximizeWindow();
	}

}
