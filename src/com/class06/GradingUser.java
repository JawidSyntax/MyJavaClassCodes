package com.class06;

import java.util.Scanner;

public class GradingUser {

	public static void main(String[] args) {
		/* Allow user to enter grade and then provide explanation:
		 * A - Excellent, B - Good, C - Average, D - Bad,
		 * Any other grade - Not acceptable.
		 * At the end your program should print which grade was entered by a user
		 * with explanation.
		 */
		Scanner scan;
		char grade;
		String rank;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter the grade");
		grade = scan.next().charAt(0);
		
		switch (grade) {
	
		case 'A':
			rank = "Excellent";
			break;
		case 'B':
			rank = "Good";
			break;
		case 'c':
			rank = "Average";
			break;
		case 'D':
			rank = "Bad";
			break;
		
		default:
			rank = "Any other number not acceptable";
		}
		System.out.println("Your rank is "+rank+".");
		
	}
}
