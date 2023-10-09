package com.tns.dayeleven.finallyblock;

public class FinallyBlockExone {
	
	public static void divide(int a, int b)
	{
		try {
			System.out.println(".....within try block ....");
			int result = a / b;
			System.out.println("result: " +result);
		}catch (ArithmeticException ae) {
			System.out.println("ArithmeticException caught " +ae.getMessage());
		}finally {
			System.out.println("Finally block...");
		}
		System.out.println("  Statement after finally block");
	}

}
