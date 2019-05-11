package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	/*How would handle InputMismatchException? Input Mismatch Exception 
	 *when user enters mismatch value then programmer expected.  */
	public static void main(String[] args) {
		
		int num = 10;
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the number");
		
		//InputMismatchException
		try {
			num = scan.nextInt();
			System.out.println(num);
		}catch(InputMismatchException e) {
			System.out.println("Enter the correct input");
			
		}
		//System.out.println("The end of the program");
	}

}
