//program to demonstrate Multiple catch block
package com.tns.dayeleven.multiplecatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	
	public static void divide()
	{
		int a, b, c;
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter two numbers :");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a / b;
			System.out.println("Division is : "+ c);
		}catch(InputMismatchException e) {
			System.out.println("Invalid input . please enter integers only");
			
		} catch( ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught :" + e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception caught "+ e.getMessage());
		}finally {
			sc.close();
		}
	}
}
