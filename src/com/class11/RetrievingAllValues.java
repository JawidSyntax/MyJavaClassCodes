package com.class11;

public class RetrievingAllValues {
	
	public static void main(String[] args) {
		
		int [] [] num = {
			
				{ 11, 12, 13, 14},
				{22, 43, 22},
				{20, 11, 15, 11,},
		};
		int rows = num. length;
		System.out.println(rows);
		
		int cols = num [2].length;
		System.out.println(cols);
		
		for (int row = 0; row<num.length; row++) {
			
			for (int col = 0; col<num [row]. length; col++) {
				System.out.println(num [row] [col]);
			}
			System.out.println();
		}
		
		String [] [] food = {
				{"Burger", "Fries", "Hot Dog", "Meatloaf"}, //first array row
				{"Lo mein", "Fried Rice", "white rice"},//second array row
				{"Biriyani", "Korma", "Naan", "Chick peas"}//third array row
				
		};
		for (int i = 0; i<food.length; i++) {
			for (int j = 0; j<food[i].length; j++) {
				
				System.out.print(food [i] [j] );
			}
			System.out.println();
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
