package com.class29;

public class FireFoxDriver extends Browser implements WebDriver, Report{

	@Override
	public void openBrowser() {
		System.out.println("Opening FireFox browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing FireFox browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing FireFox browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find elements in FireFox browser");
		
	}

	@Override
	public void getReport() {
		System.out.println("Find elements in FireFox browser");
		
	}

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh FireFox browser");
		
	}

	@Override
	public void takeScreenShot() {
		System.out.println("Taking screen shot in FireFox Browser");
		
	}

	@Override
	public void execute() {
		System.out.println("An interface can have more than one parent classes but use extends to build relationship");
		
	}

}
