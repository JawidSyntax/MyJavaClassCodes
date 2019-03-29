package com.class07;

public class IncrementAndDecrement {
	public static void main(String[] args) {
		
		//post increment & post decrement
		//a++;              a--;
		
		int a = 299;
		int b = a++; //First assign -->increment (once the value of a is assigned to b then b will hold the value for a. int b = a; a=a+1
		System.out.println(a);//300
		System.out.println(b);//299
		
		//Post decrement    x--;
		
		int z = 10;
		int c=z--; //First assign and then decrement (Int c = z and then z=z-1)
		System.out.println(z);//9
		System.out.println(c);//10
		
		
		
	}

}
