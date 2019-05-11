package com.class34;

public class Task3 {
	
/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map to store personId and a Person Object. Print each object details. */

	private String name, lastName;
	private int age, salary;
	
	public Task3(String name, String lastName, int age, int salary) {
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	public void personInfo() {
		
		System.out.println("Person name is " + name + " and lastName is " + lastName + " is " + age + " years " + " makes " + salary + " annualy");
		
	}
	
}
