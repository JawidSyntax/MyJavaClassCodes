package com.class19;

public class Calculator {
	

 int sumOfValues (int a, int b, int c) {
	return a + b + c;
}
 
 int aveOfValues ( int a, int b, int c) {
	 return (a + b + c) /3;
 }
 int minOfvalues ( int a, int b, int c) {
	 int min = 0;
		if (b < a) {
			min = b;
		}
			if (c <min) {
				min =c;
 }
			return min;
			
 }
 int maxOfvalues ( int a, int b, int c) {
	 int max = 0;
		if (b >a) {
			max = b;
		}
			if (c >max) {
				max =c;
			}
			return max;
			
}}
