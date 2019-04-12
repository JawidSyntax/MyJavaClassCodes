package com.class21;

public class InstanceVariables {
	
	String name = "John"; // this is an instance (Global) variable, and can be accessed ONLY
	// an object is created for it.
	//Instance variables can have ACCESS MODIFIERS
	public static void main(String[] args) {
		
		String name = "Anna";
		System.out.println(name);
		System.out.println("--Changing value of local variable--");
		name = "Olga";
		System.out.println(name);
		
		//creating 1 object
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		System.out.println("--Changed the value of instance variable");
		obj.name = "Jack";
		System.out.println(obj.name);
		
		//creating second object
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		obj.hello(obj1.name);
	}
	public void hello (String name) {
		System.out.println("Hello " + name);
	}

}
