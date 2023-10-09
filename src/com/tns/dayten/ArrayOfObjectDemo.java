//program to demonstrate Array of student objects
package com.tns.dayten;

public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		//Array of integers
		
		Student[] arr;
		//allocating memory for  5 objects of type student
		
		arr = new Student [5];
		
		//initialize the first elements of the array
		
		arr[0] = new Student(1,"vishal");
		arr[1] = new Student (2,"poovarasan");
		arr[2] = new Student (3,"akalya");
		arr[3] = new Student (4,"gowtham");
		arr[4] = new Student (5,"lisha");
		
		for(int i=0; i<arr.length;i++)
		System.out.println("Element at  "+ i +": "+ arr[i].getRollNo()+" "+arr[i].getName());
		
		
	}

}
