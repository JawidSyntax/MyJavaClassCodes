package com.class26;

public class SuperWithConstructor {
	
	public SuperWithConstructor() {
		System.out.println(" I am  a parent class constructor");
	}
	public SuperWithConstructor(String str) {
		System.out.println(" I am  a parent class constructor with one parameter");
	}
}
class ChildOfSuperWithConstructor extends SuperWithConstructor{
	public ChildOfSuperWithConstructor () {
		//Super(); - Compiler adds it by default
		
		super("Hello"); // super. or super() must always be the first statement or line in the method.
		System.out.println(" I am a child class constructor");
	}
}
