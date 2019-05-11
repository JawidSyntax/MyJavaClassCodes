package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapFromArray {
	
	public static void main(String[] args) {
		//					1			2		3		4		5		6
		String [] names = {"Mehmet", "Asha", "Amina", "Omer", "Siyar", "Danny"};
		
		Map<Integer, String> nameMap = new LinkedHashMap();
		
		int key=1;
		
		for (String name : names) {
			nameMap.put(key, name);
			key++;
			
		}
		System.out.println(nameMap);
		
		//Print key and values using entryset (loop & Iterator)
		
		for (Map.Entry<Integer, String> entry : nameMap.entrySet()) {
			String check  = entry.getKey() + " == " + entry.getValue();
			System.out.println(check);
		}
		
		Iterator <Map.Entry<Integer, String>> iterator = nameMap.entrySet().iterator();
		while ( iterator.hasNext()) {
			Map.Entry<Integer, String> value = iterator.next();
			String check2 = value.getKey() + " and the value is " + value.getValue();
			System.out.println(check2);
		}
	}

}
