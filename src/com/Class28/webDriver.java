package com.Class28;

public interface webDriver {
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();

}
class ChromeDriver implements webDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome can open pages fast");
		
	}

	@Override
	public void closeBrowser() {
	System.out.println("Chrome can close pages faster");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("It is easy to max the window in chrome");
		
	}

	@Override
	public void findElement() {
		System.out.println("Chrome is friendly to find elements");
		
	}
}
class FirefoxDriver implements webDriver{

	@Override
	public void openBrowser() {
	System.out.println("Firefox opens pages slow");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox closes pages faster");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox can max page quickly");
		
	}

	@Override
	public void findElement() {
		System.out.println("Firefox can find element differently");
		
	}
	
}
