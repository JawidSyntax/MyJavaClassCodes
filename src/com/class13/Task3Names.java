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

		if(gender.equalsIgnoreCase ("boy")) {
			child = dad.substring(0, dad.length() / 2)
					+ mom.substring(mom.length() /2);
		}
		else if (gender.equals ("girl")) {
				child = mom.substring(0, mom.length() / 2)+ dad.substring(dad.length( )/ 2);
		} else {
			child = "No suggestion";
		}
			System.out.println(child.toUpperCase());
		}
	}


