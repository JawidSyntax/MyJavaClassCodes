package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ReplaceDrinks {
	
	public static void main(String[] args) {
		
		ArrayList <String> drink = new ArrayList<>();
		
		drink.add("alchole");
		drink.add("soda");
		drink.add("juice");
		drink.add("tea");
		drink.add("coffee");
		
		for (int i=0; i<drink.size(); i++) {
			String drink1 = drink.get(i);
			if(drink.contains("a") || drink.contains("e")){
				drink.set(i, "Water");
			}
		}
		System.out.println(drink);
		
	}

}
