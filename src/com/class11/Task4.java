package com.class11;

public class Task4 {
	
	public static void main(String[] args) {
		
		// create a 2D array where you will store the following values, Mr. Mrs, Ms, Miss
		//and Smith, Jordan, Jackson, Obama, after storing values print the following
		//Mrs Smith, Mr. Obama, Ms. Jackson
		
		String [] []  titles = {
				
				{"Miss", "Mrs", "Mr", "Ms"},
				{"Smith", "Obama", "Jackson", "Jordan"},
			
		};
		
		System.out.println(titles [0] [0]  + "   " + titles [1] [0]);
		System.out.println(titles [0] [1]  + "   " + titles [1] [1]);
		System.out.println(titles [0] [2]  + "   " + titles [1] [2]);
		System.out.println(titles [0] [3]  + "   " + titles [1] [3]);
	}

}
