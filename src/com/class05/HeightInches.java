package com.class05;

import java.util.Scanner;

public class HeightInches {
	public static void main(String[] args) {
		/* Prompt the user to enter two people's heights in inches.
		 *  Each person should be classified as one of the following:
		 *  • short (under 5 feet)
		 *	• medium(5 to 6 feet)
		 *	• tall (6 feet and over)
		 */
		
		Scanner myScanner;
		
		int height;
		
		Scanner data = new Scanner(System.in);
		System.out.println("enter your height");
		height = data.nextInt();
		
		if(height>=0 && height<5) {
			System.out.println("You are short");
		}
		else if(height >=5 && height<6) {
		System.out.println("You are medium");
	}
	else if (height>=5 && height<=7){
		System.out.println("You are tall");
	}
	else {
		System.out.println("You are out of range");
	
		
	}
}
}
