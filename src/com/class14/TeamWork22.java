package com.class14;

public class TeamWork22 {

	public static void main(String[] args) {

		// Write a java program to find Maximum and minimum number in the array?

		int[] array = { 1, 2, 3, 4, 6, 5, 9, 8, 7, 10 };

		int min = array[0];
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min + 1) {
				min = array[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
