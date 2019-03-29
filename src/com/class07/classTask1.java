package com.class07;

public class classTask1 {
	public static void main(String[] args) {
		
		/*
		 * Declare variable and increase by 100 using shorthand operator
         * 2. Declare variable and decrease by 67 using shorthand operator
         * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
         * each person should get an equal piece of cake
         * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
         * using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
         */
		
		
		//Task 1
		int a = 1;
		a+=100;
		System.out.println(a);//101
		
		//Task 2
		int b = 200;
		b-=67;
		System.out.println(b);
		
		//Task3
		int cakePiece = 11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		//Task4
		int cakePieces = 25;
		cakePieces%=7;
		System.out.println(cakePieces);
		
	}

}
