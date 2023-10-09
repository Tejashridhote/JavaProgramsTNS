package com.tns.dayelevenn;

public class UnCheckedException {

	public static void main(String[] args) {
		
		int x[];
		try {
			
			 x= new int[] {1,2,3,4};
			 System.out.println(x[6]);// out of bound
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("specified index  does not exist" +e.getMessage());
		}

	}

}
