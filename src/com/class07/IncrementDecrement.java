package com.class07;

public class IncrementDecrement {
	
	public static void main(String[] args) {
		
		int x = 1;
		x = x+1;
		System.out.println(x);//2
		
		int y = 1;
		y+= 1;
		System.out.println(y);//2
		
		int z = 1;
		z++;
		System.out.println(z);//2
		
		int w=2;
		w++;
		System.out.println(w);//3
		
		int v=10;
		v--; //First we assign and then we decrement
		System.out.println(v);//9
		
		int a=10;
		int b = ++a;//preincrement = first increment --> assign
		
		System.out.println("Value of b is "+b);//11
		System.out.println("Value of a is "+a);//11
		
		int c=10;
		int d=c++; //postincrement = First assign --> increment
		System.out.println("Value of d is "+d);//10
		System.out.println("Value of c is "+c);//11
		
		int q = 100;
		int e=q--;
		System.out.println("Value of e is "+e);//100
		System.out.println("Value of q is "+q);//99
		
		int h = 50;
		int g =--h; //first decrement --> assign
		System.out.println("Value of h is "+h);//49
		System.out.println("Value of g is "+g);//49
		
		int f = 10;
		int j = ++f;
		int j1 = f++;
		System.out.println(f);
		System.out.println(j1);
		
		
	}

}
