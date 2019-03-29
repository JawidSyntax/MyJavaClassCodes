package com.class06;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		
		
		double num1, num2, num3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct double values");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+ " is the largets");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2+ " is the larget");
		}
		//since num3 is the last option in this group therefore we don't need the else if
		//condition, we could only use else and get the result
		else if (num3>num1 && num3>num2)  {
			System.out.println(num3+ " is the largets");
		}
		
	}

}
