package com.class25;

public class Student {
	
	public void study() {
		System.out.println("Students must study");
	}
	protected void doHomeWork () {
		System.out.println("Students must do do homework");
	}
	void attendClasses() {
		System.out.println("Students must attend the classes");
	}
	//Private Methods can not be overridden
	private void doreResearch () {
		System.out.println("Students must do research");
	}

}
