package com.class11;

public class Task2 {
	
	public static void main(String[] args) {
		
		//Create an array of countries. While retrieving all values from an array print capital for each country. 
		//(use 2 different loops).
		
		String [] country = {"USA", "AFG", "TURKEY", "JAPAN"};
	
		for( int i = 0; i<country . length; i++) {
			
			if (country[i].equals("USA")) {
				System.out.println("Washington");
			}	else if (country[i].equals("AFG")) {
				System.out.println("Kabul");
			}else if (country[i].equals("TURKEY")) {
				System.out.println("Ankara");
			}else if (country [i].equals("JAPAN")){
				System.out.println("Tokyo");
			}
		}
		
		// THE SECOND WAY IS TO USE SWITCH
		
		String [] array = {"Mxico", "Argentina", "India", "Taiwan"};
		
		for (String capitals : array ) {
			
			switch(capitals) {
			case "Mxico" : 
				System.out.println("Mexico City");
			break;
			case "Argentina" : 
				System.out.println("San Paulo");
				break;
			case "India":
				System.out.println("Dehli");
				break;
			case "Taiwan":
				System.out.println("Taipe");
				break;
			default:
				System.out.println(" It is not a country");
			}
		}
	}

}
