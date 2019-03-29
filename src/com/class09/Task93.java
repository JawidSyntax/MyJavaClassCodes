package com.class09;

import java.util.Scanner;

public class Task93 {
	public static void main(String[] args) {
		
		/* Write a program that reads a range of integers
		 *  (start and end point), provided by a user and then from 
		 *  that range prints the sum of the even and odd integers.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int S; 
		int E;
		int sumeven = 0, sumodd = 0;
		System.out.println("Enter Start Range Number");
		S = input.nextInt();
		System.out.println("Enter End Range Number");
		E = input.nextInt();
		
		for (int i=S;  i<=E; i++) {
			if(i%2 ==0) {
				sumeven+=i;
				
			}else {
				sumodd+=i;
			}
		}
		System.out.println("The sum of odd numbers in your range "+S+" to "+E+" is " +sumodd);
		System.out.println("The sum of even numbers in your range "+S+" to "+E+" is " +sumeven);
	}

}
