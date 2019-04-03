package com.class14;

public class TeamWork2 {

	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array?

		int firstlargest = 0;
		int secondlargest = 0;
		int[] array = { 1, 2, 3, 4, 6, 5, 9, 8, 7, 10 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] > firstlargest) {
				secondlargest = firstlargest;
				firstlargest = array[i];

			} else if (array[i] > secondlargest) {
				secondlargest = array[i];
			}
		}
		System.out.println(secondlargest);

	}
}


