package com.class04;

public class mortgageRateAndPrice {
	public static void main(String[] args) {

		/*Create a Java program and store variables to store mortgage rate and mortgage price.
		 *First program should check if rate is higher than 4.5 user will not buy a house,
		 *otherwise user will consider buying.
		 *Once user decides to buy a house,
		 *if price of the house is larger than 200000 than user will take a loan,
		 *otherwise user will pay cash.
		 */
		double mortgagerate = 3.5;
		int price = 180000;
		
		if(mortgagerate>6.5) {
			System.out.println("I will buy the house");
		if(price>300000) {
				System.out.println("I will pay in cash");
			}
		else {
			System.out.println("I will take a loan");
		}
		}
		else {
			System.out.println("I will not buy the house");
		}
		
	}
}	

	

