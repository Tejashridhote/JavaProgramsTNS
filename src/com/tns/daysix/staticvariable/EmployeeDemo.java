package com.tns.daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		//create the first object of the class and pass the two 
		//string and int
		Employee e = new Employee ("arun",123);
		System.out.println(e);
		
		//second object
		e= new Employee("deep",121);
         System.out.println(e);
         
         System.out.println(Employee.companyName);
        

	}

}
