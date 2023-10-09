//child class implements inner interface
package com.tns.dayeight.interfaces.nestedinterfaces;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface {
	@Override
	public void print() {
		System.out.println("print method of nested interface");
	}

}
