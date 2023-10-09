package com.tns.daynine;

public class StringComparison {

	public static void main(String[] args) {
		
		//creating Strings using Literals
		String s1 ="TNSIF";
		String s2 ="TNSIF";
		
		
		//creating strings using new operator
		String s3= new String ("TNSIF");
		String s4 = new String ("TNSIF");
		
		//== and equals
		System.out.println("s1 == s2: "+ (s1 == s2));
		System.out.println("s1 == s3:"  + (s1 == s3));
		System.out.println("s4 == s3 :"+ (s4 == s3 ));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compareTo
		System.out.println(s1.compareTo("TNSIF"));
		System.out.println(s1.compareToIgnoreCase("TNSIF"));
		System.out.println(s1.compareTo(s2));
		
			
		}
		
	}


