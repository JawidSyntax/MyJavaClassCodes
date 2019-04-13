package com.class22;

public class StaticVsNonStatic {
	
	public String name = "John"; //Instance variable
	
	public static String lastName = "Snow"; // static variable
	
	public static void main(String[] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.getInfo();
		getInfo1();//just use name within the same class, we can call it by using / variable name
		
		System.out.println(lastName);
		System.out.println(obj.name); //non static variables can be accessed only within the instance or object.
	}
	//non-static method can access both static and non static variables.
	public void getInfo() {
		System.out.println("My name is " +name + " and my last name is " + lastName);
	}
	//static method can have access only to static variable
	public static void getInfo1() {
		//System.out.println("My name is " +name + " and my last name is " + lastName);
		// will get an erro :Cannot make a static reference to the non-static field name.
		System.out.println("I am a static method");
	//	getInfo(); Cannot make a static reference to the non-static method getInfo() from the type StaticVsNonStatic
		//we can not access non static method within static
	}
	

}
