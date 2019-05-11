package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class KeyAndValuesUsingEntrySet {
	
	public static void main(String[] args) {
		
		//create a map to store userDetails (name, salary, department, title).
		
		Map <String, String> userDetailsMap = new LinkedHashMap<>();
		
		userDetailsMap.put("Name", "Alex Smith"); //1 entry = key = name + value = "Alax Smith"
		userDetailsMap.put("Salary", "90000");//2 entry
		userDetailsMap.put("Department", "IT");//3 entry
		userDetailsMap.put("Title", "Automation Tester");//4 entry
		
		System.out.println(userDetailsMap);
		userDetailsMap.entrySet(); //this returns a set of entries
		
		for ( Map.Entry <String, String> entry :userDetailsMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("-----------------Using Iterator-------------------------------");
		Iterator <Map.Entry <String, String>> it = userDetailsMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry=it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}

}
