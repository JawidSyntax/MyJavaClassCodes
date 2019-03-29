package com.class11;

public class Task6ArrayofCars {
	
	public static void main(String[] args) {
		
		//create an array of cars: American, German, Korean, Italian.
		//then retrieve all values from that array.
		
		
		String [] [] cars = {
				
				{"Ford", "Chave", "Cadliac", "Mustang"},
				{"Benz", "Audi"},
				{"Hyndai", "Boon", "Car"},
				{"Fiat", "Mazarati", "Goolan"},
		};
		
		for (int a = 0; a<cars.length; a++ ) {
			for (int b = 0; b<cars[a].length; b++) {
				System.out.print(cars [a] [b] + "   ");
				
			}
			System.out.println();
		}
		
	}

}
