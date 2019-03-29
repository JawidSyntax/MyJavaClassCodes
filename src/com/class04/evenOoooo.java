package com.class04;

import java.util.Scanner;

 public class evenOoooo {
//IMPORTANT: You must use a Scanner class for this conditional statement
//Input variable in console using 121.
//Find out if a number is Even or ODD
//Please display "Even" if number is even
//and "Odd" if the number is an odd number

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
	
		num = sc.nextInt();
		if(num % 2 == 0){ 
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		}
 

}
