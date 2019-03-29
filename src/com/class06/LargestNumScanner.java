package com.class06;

import java.util.Scanner;

public class LargestNumScanner {
public static void main(String[] args) {
	
	int num1, num2, num3, largest;

	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter 3 distinct double values");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	num3 = scan.nextInt();
	
	if(num1 > num2) {
		if(num1>num3) {
			largest = num1;
		}else {
			largest = num3;
		}
		} else {//assuming num2 > num1)

		}
		if(num2>num3) {
			largest = num2;
		}else {
			largest = num3;
		}
System.out.println("This is the largest number");
}

}


