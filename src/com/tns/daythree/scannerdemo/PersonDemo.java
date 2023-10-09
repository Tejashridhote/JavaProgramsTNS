//Program to demonstrate encapsulation
package com.tns.daythree.scannerdemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		//scanner object to accept user inputs
		Scanner ob = new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person Name : ");
		name = ob.next();
		System.out.println("Enter age: ");
		int age = ob.nextInt();
		System.out.println("Enter gender: ");
		String gender = ob.next();
		System.out.println("Enter taxable income: ");
		int income = ob.nextInt();
		
		//Person object and initialize values using setter
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		//display person details using toString() method
		System.out.println(person);
		
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(person); //tax calculation
		System.out.println("After calculating tax : ");
		System.out.println(person);

		ob.close();
	}

}
