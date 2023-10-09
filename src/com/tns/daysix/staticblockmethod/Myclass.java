//program to demonstrate static block
package com.tns.daysix.staticblockmethod;

public class Myclass {

	private int section;//non -static or instance variable
	private static int srNo; //static variable
	
	//static block
	static {
		System.out.println("......within static block......");
		srNo =1000;
	}
	//default constructor
	Myclass ()
	{
		System.out.println("....within default constructor...");
		srNo++;
		section++;
	}
	@Override
	public String toString() {
		return "Myclass [Serial No "+srNo+",section=" + section + "]";
	}
	
	//static method
	static void display()
	{
		//System.out.println("section :"+ section);
		System.out.println("serialNo: " +srNo);
	}
	
}
