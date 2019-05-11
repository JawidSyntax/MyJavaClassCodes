package com.class30;

import java.util.ArrayList;
import java.util.Iterator;
public class GetAllValueFromArrayList {
	
	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList();
		names.add("John");
		names.add("Jack");
		names.add("Sam");
		names.add("Nick");
		
		System.out.println("-----------1 way using for loop");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("--------2 way using advance for loop");
		for( Object name: names) {
			System.out.println(names);
		}
		System.out.println("--------3 way using Iterator-------------------");
		Iterator <String> it = names.iterator();
	//	boolean check = it.hasNext();
		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a);
		}
	}
}
