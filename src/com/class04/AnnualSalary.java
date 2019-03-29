package com.class04;

import java.util.Scanner;

public class AnnualSalary {
	
	public static void main(String[] args) {
		/*Write a program to ask user to enter numbers of worked years and annual salary.
		 *If user worked for more or equals to 5 years than user is eligible for the bonus,
		 *otherwise he is not.
		 *Once user is eligible and salary is larger than 50000 than bonus = 5000,
		 *otherwise bonus=3000.
		 * */
		
		int WYears;
		double ASalary;
		
		Scanner bonus = new Scanner(System.in);
		System.out.println("Enter your Number of Years Worked");
		WYears = bonus.nextInt();
		System.out.println("Enter your annual salary");
		ASalary = bonus.nextDouble();
		
		if(WYears>5) {
			System.out.println("The user is eligible for bonus");
			if(ASalary>50000) {
				System.out.println("The user is eligible for 5000 bonus");
			}
			else {
				System.out.println("The user is eligible for 3000 bonuns");
			}
		}
		
		
		
		System.out.println("Hello");
		
		
		
		
	}
	

}
