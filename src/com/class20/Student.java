package com.class20;

public class Student {

	/*
	 * Create a class student that will have a method getGrade your method should
	 * accept the score of a student and return a grade Score > 90 - A Score > 80 -
	 * B Score > 70 - C Score >50 - D anything else - F
	 */
	public static void main(String[] args) {

		Student obj = new Student();
		char myGrade = obj.getGrade(60);
		System.out.println("My grade at Syntax is " + myGrade);

	}

	 char getGrade(int score) {

		if (score > 90) {
			return 'A';
		}
		if (score > 80) {
			return 'B';
		}
		if (score > 70) {
			return 'C';
		}
		if (score > 60 && score == 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}
