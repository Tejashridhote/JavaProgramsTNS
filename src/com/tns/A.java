package com.tns;

public class A {
	private int x;
	private int y;
	
	public A() {
		System.out.println("This is default constructor");
	}
	

	public A(int x, int y) {
		
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}
	

}
