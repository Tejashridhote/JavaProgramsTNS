package com.tns.dayetwelve;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			
			String str = CheckedException.acceptText(); //reads the line from console
			System.out.println("Your string is "+str);
		}catch(IOException e) {
			System.err.println("An error ocuured while reading input" +e.getMessage());
		}

	}

	
	
}
