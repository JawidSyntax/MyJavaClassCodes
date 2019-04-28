package com.class29;

public class Registration {
	
	private String email, userName, password, gmail;
	
	
	void creatEmail() {
		if(email.equals(gmail)) {
			System.out.println("you have a valid email ");
		}else {
			System.out.println("enter correct email");
		}
	}
	public static void main(String[] args) {
		Registration obj = new Registration();
		obj.creatEmail();
	}
}
