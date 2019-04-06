package com.class17_2;

import java.util.Scanner;

public class LeapYears {
	
	public static void main(String[] args) {
		
		/* Ask a user to input a leap year. Give the user 10 chances to 
		 * enter a correct leap year. As soon as the user enters the
		 *  correct leap year exit the loop*/
		
		int year;
		Scanner scan = new Scanner(System.in);
		
		
		for (int y = 1; y<=15; y++) {
			System.out.println("Please enter a year");
			year = scan.nextInt();
				if (year % 4 !=0) {
					System.out.println(year+ " is not a leap year");
				}else if(year % 4 ==0) {
					System.out.println(year+ " is a leap year");
					break;
				}
		}
		

	}

}
