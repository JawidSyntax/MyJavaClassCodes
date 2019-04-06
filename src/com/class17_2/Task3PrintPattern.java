package com.class17_2;

public class Task3PrintPattern {
	public static void main(String[] args) {

		/*
		 * Print the following pattern: 1 12 123 1234 12345
		 */

		for (int p = 1; p < 5; p++) {
			for (int v = 1; v <= p; v++) {
				System.out.print(v);
			}
			System.out.println();
		}

		for (int g = 5; g <= 1; g++) {
			for (int h = 1; h >= g; h--) {
				System.out.print(h);
			}
			System.out.println();
		}
	}
}
