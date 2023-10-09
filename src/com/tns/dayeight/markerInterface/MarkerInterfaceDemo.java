package com.tns.dayeight.markerInterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s= new Student(101,"neha",120.0d,"java");
		System.out.println(s);
		if( s instanceof Registrable)
			System.out.println(" student is registerd  for the course");
		else
			System.out.println("student is not registerd  for the course");

	}

}
