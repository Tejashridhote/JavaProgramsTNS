package com.tns.daythirteen;

public class Runnabledemo {

	public static void main(String[] args) {
		
		UsingRunnable ur = new UsingRunnable(10,20,"Hello");
		
		@SuppressWarnings("unused")
		Runnable runnable = new Runnable () {
			
			@Override
			public void run() //Anonymus class
			{
				System.out.println("Runnable with Anonymous class");
			}
		};
			
		Thread t1 = new Thread (ur);
		t1.start();
		
			}
	
	
		

	}


