package com.tns.daysix.staticblockmethod;

public class MyclassDemo {

	public static void main(String[] args) {
		Myclass obj = new Myclass();
		System.out.println(obj);
		
		//static method class name
		Myclass.display();
		
		Myclass obj2= new Myclass();
		System.out.println(obj2);
		
		Myclass obj3= new Myclass();
		System.out.println(obj3);
		Myclass.display();
		

	}

}
