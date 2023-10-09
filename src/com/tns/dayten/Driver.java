package com.tns.dayten;

public class Driver {

	public static void main(String[] args) {
	
		int n= 15;
		int a[] ;  // declaration
	a= new int[n];
	
	//display the array 
	ArrayOperations.printArray(a);
	
	//assigning the values in array a
	for(int i=0; i<a.length; i++)
		a[i] = 5 *i ;
	
	ArrayOperations.printArray(a);
	
	int b[] = { 10, 20, 30 ,40 ,50} ; //initialization at the time of declaration
	ArrayOperations.printArray(b);
	
	
	//calling variable argument function
	System.out.println("sum of array elements is : " + ArrayOperations.getSum(b));
	System.out.println("sum of array elements is : " + ArrayOperations.getSum(10, 20));
	
	b[4] = 999; // assigning  single element
	ArrayOperations.printArray(b);
	
	//Display total no of odd and even numbers in array b
	
	System.out.println(" Odd numbers:"  + ArrayOperations.getOddCount(b)  + "\t Even numbers : "+ArrayOperations.getEvenCount(b)  );
	System.out.println();
	System.out.println("  ......................");
}
}