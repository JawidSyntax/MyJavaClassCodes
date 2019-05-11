package com.class35;

public class UncheckedException {
	
	public static void main(String[] args) {
		
		int [] array = {12, 13, 12};
		System.out.println(array[3]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//at com.class35.UncheckedException.main(UncheckedException.java:8)
		
		String a = "Hello";
		System.out.println(a.charAt(5));
	/*	Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
		at java.lang.String.charAt(Unknown Source)
		at com.class35.UncheckedException.main(UncheckedException.java:13)*/
		
		String str = null;
		System.out.println(str.length());
		/*Exception in thread "main" java.lang.NullPointerException
		at com.class35.UncheckedException.main(UncheckedException.java:19)*/
	}

}
