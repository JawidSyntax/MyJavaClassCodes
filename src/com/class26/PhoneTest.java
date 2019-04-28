package com.class26;

public class PhoneTest {
	
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("---------------Object of iphone-----------------");
		iPhone  iphone = new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		System.out.println("---------------Object of Samsung-----------------");
		Samsung samsung = new Samsung();
		samsung.makeCall();
		samsung.hasCamera();
		System.out.println("---------------Object of Nokia-----------------");
		Nokia nokia = new Nokia();
		nokia.hasCamera();
		nokia.makeCall();
		
		System.out.println("-----Object of iPhone class referring to the Parent");
		Phone p=new iPhone();
		p.makeCall();
		p.hasCamera();
		
		Phone p1=new Nokia();
		p1.makeCall();
		p1.hasCamera();
		//p1.cannotBreak();ce: method is undefined
		//creating a variable of a ParentType
		Phone parentPhone;
		//assinging iphone object
		parentPhone=new iPhone();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		//assinging samsung object
		parentPhone=new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		//assinging Nokia object 
		parentPhone=new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		
		
		
	}

}
