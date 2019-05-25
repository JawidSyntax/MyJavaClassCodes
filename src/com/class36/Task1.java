package com.class36;

public class Task1 {
	
	//create an exception : when user it trying to withdraw larger amount that balance
		// throw an exception saying "You do not have enough money"
		public static void main(String[] args) {

			balanceCheck(1000, 1200);
		}

		public static void balanceCheck(int currentBalance, int expectedBalance) {

			if (currentBalance > expectedBalance) {
				System.out.println("Please withdraw your money");
			} else {

				throw new ArithmeticException("You can not withdraw this much");

			}
		}
	}
