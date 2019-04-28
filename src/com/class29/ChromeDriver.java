package com.class29;

public class ChromeDriver extends Browser implements WebDriver, Report{

	@Override
	public void openBrowser() {
		System.out.println("Opening Chrome browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing Chrome browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing Chrome browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find elements in Chrome browser");
		
	}

	@Override
	public void getReport() {
		System.out.println("get report from Chrome browser");
		
	}

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh Chrome Browser");
		
	}

	@Override
	public void takeScreenShot() {
		System.out.println("Taking screen shot in Chrome Browser");
		
	}

	@Override
	public void execute() {
	System.out.println("An interface can have more than one parent classes but use extends to build relationship");
		
	}
	

}
