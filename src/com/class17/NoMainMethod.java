package com.class17;

public class NoMainMethod {
	
	//methods are variables are member of the class
	
	String str; // variables are also called data members
	
	
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
		System.out.println("Hello");
		System.out.println("Hello friends");
	}
	void bye() {
		System.out.println("Bye");
	}
	 public static void main (String [] args) { // Method Signature
		 
		 NoMainMethod obj = new  NoMainMethod(); // Method body
		 
		 obj.hello();
		 obj.bye();
		 
		 
	 }
	 void howAreYou() { // we can not create a method inside anothe method, it should be out
		// of the method but inside the same class.
		 System.out.println("How are you");
	 }
	}


