package com.class33;

import java.util.*;


public class MapBestBuy {
	
	/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Print all keys and values from a Best Buy map using EntrySet.   */
	
	public static void main(String[] args) {
		
		Map <Integer, String> list = new LinkedHashMap();
		
		list.put(12300, "Printer");
		list.put(123545, "TV");
		list.put(23234, "Camera");
		
		System.out.println(list);
		
		System.out.println("--------------using for loop-----------");
		for( Map.Entry<Integer, String> listcheck:list.entrySet()) {
			System.out.println(listcheck.getKey() + " = " + listcheck.getValue());
			
		}
		System.out.println("--------------using Iterator-----------");
		Iterator <Map.Entry<Integer, String>> it = list.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		
		}
		
	}

}
