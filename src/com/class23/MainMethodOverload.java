package com.class23;

public class MainMethodOverload {
	
	public static void main(String args) {
		System.out.println("I am main method with string argument ");
	}
	public static void main () {
		System.out.println("I am main method with no parameters");
}
	public static void main(String [] array) {
		String a1 = "Hello World";
		System.out.println("I am main method with string argument " + a1);
	}
	public static void main (int a) {
		System.out.println("I am main method with inteter parameters " + a);
	}
}
