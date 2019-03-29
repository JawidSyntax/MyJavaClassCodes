package com.class04;

public class NestedIfAgain {
	/*
	 * Declare variable for GPA and having a diploma if user has a diploma->
	 * congratulations --> if GPA is higher 3.5--> hire person else do not hire
	 */
	public static void main(String[] args) {

		double GPA = 3.6;
		double expectedGPA = 3.7;

		boolean hasDiploma = true;

			if (hasDiploma) {
				System.out.println("Congratuations");

						if (GPA > expectedGPA) {
							System.out.println("You are hired");
						} else {
							System.out.println("Unfortunately we cannot hire you");
						}
		} else {
			System.out.println("Please get your degree");
		}
	}
}
