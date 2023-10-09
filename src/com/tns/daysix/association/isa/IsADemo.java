package com.tns.daysix.association.isa;

public class IsADemo {

	public static void main(String[] args) {
		Employee emp = new Employee("srikanth",101,"IT");
		Manager manger = new Manager("vikas",102,"C2TC",10);
		
		System.out.println(emp);
		System.out.println("--------------------");
		System.out.println(manger);

	}

}
