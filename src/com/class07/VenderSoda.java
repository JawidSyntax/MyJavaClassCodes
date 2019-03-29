package com.class07;

import java.util.Scanner;

//import java.util.Scanner;

public class VenderSoda {
	public static void main(String[] args) {

		/*
		 * Ask user to pay for a soda Keep asking user to pay for soda until entered
		 * price is not equal to 1.99 after user got a right amount print -->
		 * "Please enjoy your soda".
		 */

		Scanner input;

		double Sodaprice;

		input = new Scanner(System.in);
		

		do {
			System.out.println("Please pay for a soda");
			Sodaprice = input.nextDouble();
			
		} while (Sodaprice != 1.99);
		System.out.println("Please enjoy the soda");
		Sodaprice++;
	}

}
