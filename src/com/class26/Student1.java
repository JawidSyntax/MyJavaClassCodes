package com.class26;

public class Student1 {
	/* Write program as a student class   that has instance variables name and address.
	 *  Create a constructor that will initialize those variables. Print name & address of given
	 *    student by the displayInfo method.
	 */
	
	String name;
	String address;
	
	public Student1() {
		
		this.name = "Ahmad";
		this.address = "Fairfax, VA";
	}
	void getinfo() {
		System.out.println("My name is " + name + " and my address is " + address );
	}
	
	public static void main(String[] args) {
		
		Student1 obj = new Student1();
		obj.getinfo();
	}

}


