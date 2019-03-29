package com.class04;

import java.util.Scanner;

public class DMVLicense {
	
	public static void main(String[] args) {
		
		Scanner DMV = new Scanner(System.in);
		
		System.out.println("Please enter age");
		
		int age = DMV.nextInt();
		
	if (age >=18) {
		System.out.println("Please issue Driver's License");
	}else {
		System.out.println("Pleae do not issue Driver's License");
	}
		
		
	}

}
