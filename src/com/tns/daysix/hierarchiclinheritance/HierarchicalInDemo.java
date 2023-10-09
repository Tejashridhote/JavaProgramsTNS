package com.tns.daysix.hierarchiclinheritance;

public class HierarchicalInDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("..........person details .......");
		System.out.println(p1);
		
		Person p;
		
		p = new Person(" abhi","blore");
		if( p instanceof Person)
			System.out.println("person details "+p );
		
		p= new Employee("nikil","chennai",101,70000,"sales");
		if( p instanceof Employee)
			System.out.println("person details "+p);
		
		p=new Student("poovaran","gobi","FE",90);
		if( p instanceof Student)
			System.out.println("person details "+p);
		
		
	}

}
