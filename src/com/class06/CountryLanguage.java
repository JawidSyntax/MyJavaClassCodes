package com.class06;

import java.util.Scanner;

public class CountryLanguage {
	public static void main(String[] args) {
		
		/*Ask user to enter country and capture it.
		 * Once values are captured print which language user speaks.
		 */
		Scanner scan;
		String country;
		String language;
		
		scan = new Scanner(System.in);
		System.out.println("Which country you are from?");
		country = scan.nextLine();
		
		switch (country) {
		
		case "Afghanistan":
			language = "Dari";
			break;
		case "Uzbekistan":
			language = "Uzbek";
			break;
		case "Egypt":
			language = "Arabic";
			break;
		case "France":
			language = "French";
			break;
		default:
			language = "unknown";
		}
		//System.out.println("You are from " +country);
	   {
	   }
		System.out.println("You are from " +country+ " Your native langauge is " + language+ ".");
	}
	}

