package com.class26;

public class Students {
	
	String fullName;
	int age;
	
	//this is used to differentiate  between local and instance variables.
	//only used when instance variables and local variables have the exact same names.
	public Students(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
		
	}
	
	public void displayDetails() {
		System.out.println("Student full name is " +fullName + "and age = " + age);
	}
	public static void main(String[] args) {
		Students obj = new Students("John Snow ", 30);
		obj.displayDetails();
	}

	
	
	
}
