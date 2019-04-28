package com.class29;

public interface TakesScreenShot {
	
	String fileExecution = ".png"; //by default 
	void takeScreenShot();
	
	static void m1() {
		System.out.println("Static m1 method");
	}
	default void m2() {
		System.out.println("Default m2 method");
	}

}
