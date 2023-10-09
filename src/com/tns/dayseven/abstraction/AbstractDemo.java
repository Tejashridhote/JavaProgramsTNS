package com.tns.dayseven.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Square sq= new Square ();
		Rectangle re = new Rectangle();
		
		sq.calArea();
		sq.show();
		
		re.calArea();
		re.show();
		System.out.println("...............");
		
		//run time polymorphism / Dynamic binding / late binding
		//ex : Method Overriding 
		
		Shape shape;
		
		shape= new Square (12.5f);
		
		shape.calArea();
		shape.show();
		
		shape = new Rectangle(10,20);
		
		shape.calArea();
		shape.show();
		

	}

}
