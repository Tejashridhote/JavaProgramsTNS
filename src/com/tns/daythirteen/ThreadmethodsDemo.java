package com.tns.daythirteen;

public class ThreadmethodsDemo {

	public static void main(String[] args) {
		
		ChildThread t1 = new ChildThread(2,"first"); //creating child thread object
		ChildThread t2 = new ChildThread(3,"second");
		ChildThread t3 = new ChildThread(3,"third");
		
		//System.out.println("Current thread :" + Thread.currentThread()); //returns current thread
		
		t1.start();
		t2.start();
		t3.start();
		Thread.currentThread().setName("parent thread"); // assign the name to thread
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); //changing priority of the thread
		
		System.out.println("Current thread: "+ Thread.currentThread()); //returns the current thread
		
		try {
			
			t1.join(); // wait current thread until t1 is dead
			t2.join(300);// wait current thread until t2 is dead or time period over
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Thread interrupted: " +e.getMessage());
		}
		
		System.out.println("....................................end main.......");
		 

	}

}
