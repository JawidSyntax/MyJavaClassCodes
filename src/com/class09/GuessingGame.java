package com.class09;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		
	/* Write a guessing game where the user has to guess a secret number between
	 *  1 and 20. After every guess input, the program tells the user whether their
	 *   number was too large or too small. The program will keep asking the user 
	 *   to enter the number until he finds the correct number. When the correct
	 *    answer is found the system should display "Congratulations!!. You got it!".*/

		Scanner input = new Scanner(System.in);
		
		int secretNum = 20;
		int number;
		
		for (int i = 1;  i<=30; i++) {
			System.out.println("Please guess a secret number");
			number = input.nextInt();
			
			if(number>secretNum) {
				System.out.println("The number you entered is too Large");
			}else if(number<secretNum) {
				System.out.println("The number you entered is too small");
			}else if(number == secretNum) {
				System.out.println("Congratulations You got it!");
				
			}
		}
		
		
	}

}
