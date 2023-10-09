package com.tns.dayten;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		int d[][] = { { 10,20,30}, { 40}, { 50,20},{10}};
		System.out.println("Total no of rows in Array d:"+d.length);
		MLArray.printArray(d);
	}

}
