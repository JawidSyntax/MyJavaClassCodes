package com.class23;

public class Addition {
	
	//overloading methods by changing number of parameters
	public void add ( int a, int b) {
		System.out.println("Method to add 2 integers");
		System.out.println(a+b);
	}
	public void add (int a) {
		System.out.println("Method to add 100 to and integer");
		System.out.println(a+100);
	}
	
	public void add (int a, int b, int c) {
		System.out.println("Method to add 3 integers");
		System.out.println(a+b+c);
	}
	//2. overloading method by changing type of parameters
	public void add (double a, double b) {
		System.out.println("Method to add 2 double values");
		System.out.println(a+b);
	}
	
	public void add (double a, double b, double c) {
		System.out.println("Method to add 3 doubles");
		System.out.println(a+b+c);
	}
	
	public void add (int a, double b, int c) {
		System.out.println("Method to add an integer to a double and to an integer");
		System.out.println(a+b+c);
		
	}

}
