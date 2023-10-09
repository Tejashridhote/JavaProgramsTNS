//Program to demonstrate Thread Life cycle
package com.tns.daythirteen;

public class ThreadLifeCycleDemo extends Thread {
	
	public void run()
	{
		System.out.println("in side run() Thread is alive or not?" + this.isAlive());
		
		int num =0;
		while(num <4)
 {
			num++;
			System.out.println("num :" +num);
			try {
				sleep(500);
				System.out.println("in not runnable stage , Thread is Alive or not ," +this.isAlive());
			}catch(InterruptedException e) {
				System.err.println("Thrad Interrupted....");
			}
		}
	}

	public static void main(String[] args) {
		
		Thread mythread = new ThreadLifeCycleDemo();
		System.out.println("Before Runnable stage Thread is Alive or not ?" +mythread.isAlive());
		mythread.start();
		
		try {
			
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			
			System.err.println("Thread is interrupted !");
			
		}
		System.out.println("After complete execution of Thread ,it is alive or not ?"+mythread.isAlive());



	}

}
