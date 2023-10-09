package com.tns.daynine;

public class WrapperClassDemo {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		//Unboxing
		Integer i = new Integer(10);
		System.out.println(i);
		
		int b = i.intValue();
		System.out.println(b);
		
		//without  using intvalue
		int c =i;
		System.out.println(c);
		
		//Autoboxing
		
		int a =100;
		Integer i1 = a;
		System.out.println(i1);
		
		
	}

}
