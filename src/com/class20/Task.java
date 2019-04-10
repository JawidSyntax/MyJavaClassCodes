package com.class20;

public class Task {
	
	String name, lastname, emailType;
	
	public static void main(String[] args) {
		
		/* create a method createEmail()
		 * Based on provided user name, lastname and email type
		 * your method should return complete email Address;
		 * johnsnow@gmail.com
		 * johnsnow@yahoo.com  */
		
		Task obj = new Task ();
		
		String email = obj.createEmail("john", "snow", "gmail");
		System.out.println(email);
		
		
		email = obj.createEmail ("Bob", "Snow", "outlook");
		System.out.println(email);
		
	}
	
	String  createEmail ( String name, String lastname, String emailType) {
		System.out.println();
	
	 String email = name + lastname + "@" +emailType + ".com"; 
	 return email.toLowerCase();
	 }

}
