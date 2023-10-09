//program to demonstrate String class
package com.tns.daynine;

public class SampleStringDemo {

	public static void main(String[] args) {
		
		//simple String operations
		char c[] = { 'I','n','d','i','a'};
		String s1= new String(c);
		String s2 = new String (s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		//Using concatenation to prevent long lines
		String longstr ="This is to show "+ "how string concatination"+ "can happen with additional"+ "operator";
		System.out.println(longstr);

	}

}
