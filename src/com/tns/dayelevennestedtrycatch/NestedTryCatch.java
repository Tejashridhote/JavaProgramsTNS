//program to demonstrate nested try catch
package com.tns.dayelevennestedtrycatch;

public class NestedTryCatch {
	public static void check()
	{
		String str ="TNS";
		int slength = str.length();
		System.out.println("String length "+ slength);
		@SuppressWarnings("unused")
		String anotherString = null;
		int y=6;
		
		try {
			// Inner try block
			try {
				System.out.println(str.charAt(y)); //Exception occured
			}catch (StringIndexOutOfBoundsException ex) {
				System.err.println("index is out of bounds" + ex.getMessage());
			}
		}catch ( NullPointerException npe) {
			System.err.println("Exception is thrown"+ npe.getMessage());
		}
	}

}
