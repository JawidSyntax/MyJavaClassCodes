package com.class07;

public class CompoundOperators {
	
	public static void main(String[] args) {
		
		int a = 10;
		a = a+10;
		System.out.println(a);
		
		
		int b  = 100;
		b = b+100;
		System.out.println(b);
		
		
		int c = 100;
		c+=100; // c=c+100;
		System.out.println(c);//200
		
		c+=35; //c=c+35
		System.out.println(c); //235
		
		c+=50; //c=c+50;
		System.out.println(c); //285
		
		int d = 30;
		d-=10; //d=d-10
		System.out.println(d);
		
		
		d+=50; //d=d+50
		System.out.println(d);//70
		
		d/=5; //d=d/5
		System.out.println(d);//14
		
		d%=2; //0
		System.out.println(d);
		
		
	}

}
