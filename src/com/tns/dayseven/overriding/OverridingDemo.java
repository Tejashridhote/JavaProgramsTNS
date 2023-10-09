package com.tns.dayseven.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		
		RBI rbi;
		//Dynamic binding assigning child class object to parent class reference variable
		rbi = new SBI();
		System.out.println(rbi.getRateOfIneterst());
		
		rbi= new ICICI();
		System.out.println(rbi.getRateOfIneterst());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfIneterst());

	}

}
