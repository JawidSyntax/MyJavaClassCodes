package com.class35;

public class MultipleCatch {
	
	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");
		
		
		try {
			Thread.sleep(2000); //new InterruptedException();
			System.out.println(10/0);//new ArithmeticException
		}catch (ArithmeticException e) {
			//There are 3 ways to print name and details of an exception
			//e.printStackTrace(); // name of the exception, details and location of the exception
		//	System.out.println();
		System.out.println(e.getMessage()); // only prints the details of the exception
			System.out.println("Code of Arithmetic Exception catch");
		}catch(InterruptedException e) {
			System.out.println("Code of Interrupted Exception catch");
		}
		System.out.println("End of code");
		System.out.println("End of code");
		System.out.println("End of code");
		System.out.println("End of code");
		System.out.println("End of code");
		System.out.println("End of code");
		
		
	}

}
