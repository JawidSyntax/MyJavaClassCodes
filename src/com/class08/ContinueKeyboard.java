package com.class08;

public class ContinueKeyboard {
	public static void main(String[] args) {
		
		for (int i = 0;  i<6;   i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
		for (int p= 0;  p<10;   p++) {
			if (p==5  || p==6) {
				continue;
			}
			System.out.println(p);
		
	}
		/*I want  to print number from 1 to 20 but skip those that divisible by 3*/
		
		for (int a=1; a<=20; a++) {
			if(a%3==0) {
				continue;
			}
			System.out.println(a);
		}
	}
}
