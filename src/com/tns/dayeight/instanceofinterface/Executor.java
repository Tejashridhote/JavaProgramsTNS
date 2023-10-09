package com.tns.dayeight.instanceofinterface;

public class Executor {

	public static void main(String[] args) {

         Phone p1 = PhoneFactory.createPhone("Samsung");
         p1.call();
         p1.sms();
         
         Phone p2 = PhoneFactory.createPhone("Jio");
         p2.call();
         p2.sms();
		
	}

}
