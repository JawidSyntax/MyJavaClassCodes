package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {
	public static void main(String[] args) {
		//generic Array that stores only String object
		
		ArrayList <String> names = new ArrayList();
		names.add("John");
		names.add("Jack");
		names.add("Sam");
		names.add("Nick");
		
		for (String nam: names) {
			System.out.println(names);
		}
		//names.add(123); not vaild since we have generic arraylist of a type of String
		
		//using our non generic arraylist we can store different types of objects
		ArrayList alist = new ArrayList();
		alist.add("String"); //String
		alist.add(100);//Integer
		alist.add(100.10);//Double
		alist.add(true);//Boolean
		alist.add('a');//Character
		
		for (Object values : alist) {
			System.out.println(values);
		}
		
		ArrayList<Boolean> booleanArrayList = new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
		for (Object val : booleanArrayList) {
			System.out.println(val);
			
		}
	}

}
