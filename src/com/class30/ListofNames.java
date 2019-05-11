package com.class30;

import java.util.ArrayList;

public class ListofNames {
	
	public static void main(String[] args) {
		
	
	/*Create a generic ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that */
	
	ArrayList <String> names = new ArrayList();
	names.add("Ahmad");
	names.add("Nasir");
	names.add("Gul");
	names.add("Zaki");
	names.add("John");
	
	System.out.println(names.isEmpty());
	System.out.println(names.contains("Zaki"));
	System.out.println(names.size());
	
	for (int i =0; i<names.size(); i++) {
		System.out.println(i);
	}
	for (String check: names) {
		System.out.println(check);
	}
		
	}
	
	}

