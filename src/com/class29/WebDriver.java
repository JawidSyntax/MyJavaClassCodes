package com.class29;

public interface WebDriver extends TakesScreenShot, Executes {
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();

}
