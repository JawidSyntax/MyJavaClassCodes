package com.class17;

public class Task3 {
	
	public static void main(String[] args) {
		
		//Create a method that will print whether given String is palindrome or not.
		
		
		Task3 name = new Task3();
		
		name.ifPalindrome("Madam");
		
	}
	void ifPalindrome(String name) {
		String reverse = "";
	for (int  i=name.length()-1; i>=0; i--) {
		reverse= reverse+ name.charAt(i);
	}
		if (reverse.equals(name)) {
			System.out.println(reverse +" is a Palindrome String");
		}else {
			System.out.println(reverse +" is not a Palindrome String");
		}
	}
	}


