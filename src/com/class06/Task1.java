package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan;

		boolean rainy, sunny, snowy;
		int temp;
		String activity = "";

		scan = new Scanner(System.in);
		System.out.println("Please enter the tempreture");
		temp = scan.nextInt();

		if (temp >40 && temp <=80) {
			System.out.println("Is it raining");
			rainy = scan.nextBoolean();
			if (rainy) {
				activity = "Watch a movie";
			} else {
				activity = "Go hiking";
			}
		}
			else if (temp >= 25 && temp < 40) {
		System.out.println("Is it Snowing");
		snowy = scan.nextBoolean();
		if (snowy) {
			activity = "Snowboarding";
		} else {
			activity = "Do coding";
		}

		if (temp >= 80) {
			System.out.println("Is it sunny");
			sunny = scan.nextBoolean();
			if (sunny) {
				activity = "Go  to the beach";
			} else {
				activity = "Do more coding";
			}
		} 
		else {
			System.out.println("Pleae enter a different number");
		}
		System.out.println("My activity for today is " + activity);
	}
}}