package com.class35;

public class ExceptionHandling {

	public static void main(String[] args) {

System.out.println("Begining of the code");

try {
	Thread.sleep(2000); // object of an exception might be throw (new InterruptedException)
}catch (InterruptedException e) {
	System.out.println("I am a catch block code");
	e.getMessage();
	System.out.println("The end of the program");
}
// InterruptedExpection e = new InterruptedExpection();
//Exception e = new InterruptedExpection();

	}

}
