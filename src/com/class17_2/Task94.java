package com.class17_2;

import java.util.Scanner;

public class Task94 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. Whenever user done with
		 * payments tell them "Thank you for shopping!"
		 */

		String item;
		int price, moeny;
		int balance;

		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to buy");
		item = scan.nextLine();
		System.out.println("How much is the price?");
		price = scan.nextInt();

		for (int a = 0; a < 15; a++) {
			System.out.println("Pleae pay the balance");
			int money = scan.nextInt();
			balance = price - money;

			if (balance > 0) {
				System.out.println("Please pay " + balance + " too.");
				price = balance;
			} else if (balance == 0) {
				System.out.println("Thank you for the business");
				break;
			}
		}

		
	}
}
