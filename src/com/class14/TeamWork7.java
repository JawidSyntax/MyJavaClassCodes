package com.class14;

import java.util.Scanner;

public class TeamWork7 {
	
	public static void main(String[] args) {
		
		//Write a java program to check whether a given number is prime or not?
		
		int num = 0;
		boolean prime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scan.nextInt();
		
		for (int  i =2; i<=num / 2 ; i++) {
			
			if (num % i ==0) {
				prime = false;
			}
		}
			if (prime) {
				System.out.println(num + " is a prime number");
			}else {
		System.out.println(num + " is not a prime number");
	}
	}
}
