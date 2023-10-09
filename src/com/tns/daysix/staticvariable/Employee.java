//program to demonstrate static variable 
package com.tns.daysix.staticvariable;

public class Employee {
	//Declare instance variables
	private String name;
	private int id;
	
	//Declare a static variable companyname with data type string
	
	static String companyName = "TNS";
	
	//Declare a two -parameter constructor with parameter name n and i
	
	Employee(String name ,int id){
		this.name=name;
		this.id= id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}
