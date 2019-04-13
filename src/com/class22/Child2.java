package com.class22;

public class Child2 extends Parent {
	
	String swim;

	public static void main(String[] args) {
		
	Child2 child2Object=new Child2();
	System.out.println("Child 2 eye color is " + child2Object.eyeColor);
	System.out.println("Child2 hair color is " + child2Object.hairColor);
	System.out.println("Child2 nose is " + child2Object.nose);
	child2Object.sing();
	
	}	
	public void sing() {
		System.out.println("Child2 can sing as good as her parents");
	}
}
	
