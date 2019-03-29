package com.class05;

import java.util.Scanner;

public class QuizScores {
	public static void main(String[] args) {
		/*	task 2
			Write a program that will read three inputs
			of scores (quiz, mid term, and final scores) and determine
			the grade based on the following rules:
			if the average score >=90 =>grade=A
			if the average score >= 70 and <90 => grade=B
			if the average score>=50 and <70 =>grade=C
			if the average score<50 =>grade=F8
		 	*/
		Scanner myScanner;
		int quiz;
		int mid;
		int fin;
		int result;
		
		Scanner Average = new Scanner(System.in);
		System.out.println("Pleaes enter your quiz score");
		quiz = Average.nextInt();
		
		System.out.println("Pleaes enter your mid score ");
		mid = Average.nextInt();
		
		System.out.println("Please enter your fin score ");
		fin = Average.nextInt();
		result = ((quiz+mid+fin)/3);
		
		if(result>=90) {
		System.out.println("You are grade A");
		}
		else if(result>=70 && result<90) {
			System.out.println("You are grade B");
		}
		else if(result>=50 && result<70) {
			System.out.println("You are grade C");
		}
		else if(result<50) {
			System.out.println("You are grade F");
		}
	}
}
