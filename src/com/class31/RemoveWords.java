package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveWords {
	
	//create an arrayList of words, remove every word that ends with "e". Use Iterator
	
	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("Cake");
		words.add("apple");
		words.add("book");
		words.add("chair");
		
		Iterator <String> rem = words.iterator();
		while(rem.hasNext()) {
		String word2 = rem.next();
		
		if(word2.endsWith("e")) {
		rem.remove();

	}
		}
		System.out.println(words);
	}
}
