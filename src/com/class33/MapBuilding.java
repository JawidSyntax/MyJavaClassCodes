package com.class33;

import java.util.HashMap;
import java.util.Map;

public class MapBuilding {
	public static void main(String[] args) {
		
		Map<Integer, String> str = new HashMap<>();
		
		str.put(001, "Google");
		str.put(002, "Syntax");
		str.put(003, "HP");
		str.put(004, "Google");
		str.put(005, "Samsung");
		str.put(006, "ASML");
		str.put(007, "Syntax");
		
		System.out.println(str.size());
		//System.out.println(str.replace(0004, "Google"));
		System.out.println(str);
		System.out.println(str.replace(0004, "Apple"));
	
		
		
	}

}
