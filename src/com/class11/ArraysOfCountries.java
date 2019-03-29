package com.class11;

public class ArraysOfCountries {
	
	public static void main(String[] args) {
		
		//Create an array of countries: north america countries, south america
		//countries, europe countries, asian countries, african countries.
		//Then print all values from that array.
		
		String [] [] country = {
			
				{"Canada", "USA"},
				{"Brazil", "Chile", "Mexico", "Argentina", "Paraguy", "Panama"},
				{"England", "Germany", "France", "Netherlands", "Poland"},
				{"India", "China", "Afghanistan", "Sri Lanka", "Iran", "Pakistan"},
				{"South Africa", "Tanzania", "Chad", "Sudan", "Egypt", "Morraco"},
				
		};
		
		for ( int c = 0; c<country.length; c++) {
			for (int d = 0; d<country[c].length; d++) {
				System.out.print(country [c] [d] + "    ");
			}
			System.out.println();
		}
	}

}
