package com.class33;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
/* Create an ArrayList of Strings and using 
 * Collections class sort the values of that ArrayList. */
	
	public static void main(String[] args) {
		
	
	ArrayList <Integer> array = new ArrayList<> ();
	array.add(100);
	array.add(300);
	array.add(500);
	array.add(200);
	array.add(400);
	
	System.out.println("Array before sorting : ");
	
	for (int i = 0; i<array.size(); i++) {
		System.out.println(array.get(i));
		
		
	}
	System.out.println("sorting using collection : ");
	Collections.sort(array);
	for (int i = 0; i<array.size(); i++) {
		System.out.println(array.get(i));
	}
	
	
	
}
}
