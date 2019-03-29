package com.class13;

import java.util.Scanner;

public class Task3Names {
	
	public static void main(String[] args) {
		
		/* Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL */
		
		String mom, dad, child;
		String  gender ;
		Scanner input = new  Scanner(System.in);
		System.out.println("What is Mom's first name?");
		mom = input.nextLine();
		
		
		System.out.println("What is Dad's first name?");
		dad = input.nextLine();
		
		System.out.println("What do you expect?");
		gender = input.nextLine();

		if(gender.equals ("boy")) {
			System.out.println("Adam");
		}
		if (gender.equals ("girl")) {
				System.out.println("Marry");
		} else {
			System.out.println("Please identfy the gender");
		}
			
		}
	}


