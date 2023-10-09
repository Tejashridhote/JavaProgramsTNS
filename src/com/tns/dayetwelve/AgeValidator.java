//Program to demonstrate user defined exception handling
package com.tns.dayetwelve;

public class AgeValidator {
	
	static void validateAge( int age ) throws InvalidAgeException{
		
		if(age <18) {
			throw new InvalidAgeException ("Inavalid age , you are not eligible to vote.");
		}
			
	}

}
