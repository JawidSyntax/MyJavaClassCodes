package com.class33;

import java.util.*;

public class MapCountries {
	
	
	
	public static void main(String[] args) {
		
		Map <String, String> map = new HashMap<>();
		
		map.put("USA", "Washington DC");
		map.put("AFG", "Kabul");
		map.put("JP", "Tokyo");
		map.put("EG", "Cairo");
		
		
		
		Set <String> caps = map.keySet();
		for(String check : caps) {
			System.out.println(check + " : " + map.get(check));
			
		}
		Collection <String> values = map.values();
		Iterator <String> it =values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

		
		
		
		
	}

}
