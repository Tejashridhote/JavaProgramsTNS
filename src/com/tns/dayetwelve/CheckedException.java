package com.tns.dayetwelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	static String acceptText()  throws IOException{
		
		try(BufferedReader br = new BufferedReader ( new InputStreamReader(System.in))) {
			
			
			System.out.println("Enter the String :");
			String str = br.readLine();
			return str;
		}
		
	}

}
