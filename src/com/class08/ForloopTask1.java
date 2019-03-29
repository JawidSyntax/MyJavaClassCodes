package com.class08;

public class ForloopTask1 {
	public static void main(String[] args) {
		
		//print numbers from 1 to 100
		
		for (int a = 1 ;  a<=100;  a++){
			System.out.println(a);
		}
		
		//print numbers from 100 to 1
		
		for ( int b =100;  b>=1;  b--) {
			System.out.println(b);
		}
		
		//print odd numbers from 1 to 20 (2ways)
		
		for (int c = 1;  c<=20;  c+=2) {
			System.out.println(c);
		}
		
		//print even numbers from 20 to 1 (2ways)
		
		for (int d = 20;  d>=1;  d-=2) {
			System.out.println(d);
		}
		//print even numbers between 20 and 50 (2ways)
		//1 way
		for (int e = 20; e<=50; e+=2) {
			System.out.println(e);
		}
		
		//2 way
		for (int g = 20; g<=50; g+=2) {
			if(g%2==0) {
				System.out.println(g);
			}
		}
		
		//print odd numbers between 20 and 50 (2ways)
		//1 way
		for (int f = 21 ; f<=55;  f+=2) {
			System.out.println(f);
		}
		//2way
		for (int k = 21 ; k<=55;  k++) {
			if(k%2==1) {
				System.out.println(k);
			}
		}
			
	}

}
