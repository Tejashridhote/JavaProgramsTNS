package com.tns.dayeight.instanceofinterface;

public class Samsung implements Phone {
	
	@Override
	public void call()
	{
		System.out.println("calling using  samsung");
	}
	
	@Override
	public void sms() {
		System.out.println("Messaging using samsung");
	}

}
