package com.class06;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		/*
		 * Program to find largest number among three numbers using nested if provided
		 * by a user (number must be distinct)
		 */
		double num1, num2, num3;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct double values");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		// num1=5, num2=4, num=3, since we are comparing num1 with both num2 and num3
		//therefore, if our first condition is false, then regardless of what value num2
		//holds, num1 will be compared with num3.
		if(num1 > num2) {
			if(num1>num3) {
				System.out.println(num1+ " is the largest");	
			}else {
				System.out.println(num3+ " is the largest");
			}
			} else {//assuming num2 > num1)
	
			}
			if(num2>num3) {
				System.out.println(num2 + " is the largest");
			}else {
				System.out.println(num3 + " is the largest");
			}
	
	}
	}

