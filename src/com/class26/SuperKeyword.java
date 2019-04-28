package com.class26;

public class SuperKeyword {
	
	String name  = "John";
	
	public void sayName() {
		System.out.println(" Parent name is " + name);
	}

}

class ChildOfSuperKeyword extends SuperKeyword{
	String name = "Michael";
	public void sayName() { // super. helps our constructor to differentiate the variables from different classes  (parant / child)
		System.out.println("Parent name is " + super.name); // we use the super. when only and only the variable names of the parent and child are the same
		System.out.println("Child name is " + name);
	}
	public void callingMethods() {
		sayName(); // by default the compiler adds this.sayName IMPLICIT way
		super.sayName(); // EXPLICIT way super. is used to call the method name
	}
}