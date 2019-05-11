package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {
	
	//Create an arraylist of cars and retrieve all the values using 4 different ways.
	
	public static void main(String[] args) {
		
		ArrayList <String> myCars = new ArrayList<String>();
		myCars.add("Toyota");
		myCars.add("Benz");
		myCars.add("BMW");
		myCars.add("Mazda");
	
		System.out.println("--------------first method-------------------");
		for (int i =0; i<myCars.size(); i++) {
			System.out.println(myCars);
		}
		System.out.println("--------------second method-------------------");
		for (Object car1 : myCars) {
		System.out.println(car1);	
	}
		System.out.println("--------------third method-------------------");
		Iterator <String> collect = myCars.iterator();
		while (collect.hasNext());
		System.out.println(collect.next());
		
		System.out.println(myCars);
	}
	
	}


