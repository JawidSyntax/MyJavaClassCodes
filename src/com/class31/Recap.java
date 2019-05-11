package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int [] array = {10,10,20,20};
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);//comes from collection
		numbers.add(0, 13);//specific to all list object
		numbers.add(0, 14);
		
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
		
		numbers.set(1, 33);
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(33));
		
		//1. Way using for Loop
		System.out.println("--------------using for loop-----------------");
		for (int i = 0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		//2. Way using advanced for loop 
				System.out.println("--------------using advanced for each loop-----------------");
				
				for (Object num : numbers) {
					System.out.println(num);
				}
				//3. Way using advanced Iterator  
				System.out.println("--------------using advanced Itrator -----------------");
				Iterator<Integer> it = numbers.iterator();
				//hasNext(); next(); remove();
				while(it.hasNext()) {
					int number = it.next();
					System.out.println(numbers);
				}
				//4. Way using while loop  
				int c =0;
				System.out.println("--------------using while loop----------------");
				while(numbers.size()>c) {
					int myNum = numbers.get(c);
					System.out.println(myNum);
					c++;
				}
				
				
				
	}

}
