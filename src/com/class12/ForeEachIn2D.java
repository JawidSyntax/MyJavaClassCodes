package com.class12;

public class ForeEachIn2D {

	public static void main(String[] args) {

		/*
		 * create a grocery list: Fruits {} Veggies {} Dairy{} Retrieve all values using
		 * 2 different loops
		 */

		String[][] grocery = {

				{ "Apples", "Banana", "Cherries", "Oranges" },
				{ "Onions", "Tomato", "Spanich", "Garlic" },
				{ "Milk", " Cheese " }, };

		System.out.println(" --------- For Each Loop Method ------------");

		for (String[] shopping : grocery) {
			for (String todo : shopping) {

				System.out.print(todo + "   ");
			}
			System.out.println();
		}

		System.out.println("**************For Loop***************");

		for (int i = 0; i < grocery.length; i++) {
			for (int b = 0; b < grocery[i].length; b++) {

				System.out.print(grocery[i][b] + " , ");

			}
			System.out.println();
		}
	}

}
