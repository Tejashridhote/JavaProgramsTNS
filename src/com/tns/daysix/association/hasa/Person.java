//program to define container class
package com.tns.daysix.association.hasa;
//container class
public class Person {
	
private String name;
private Address address;

 public Person(String name,Address address)
 {
	 this.name= name;
	 this.address = address;
	
 }
 //getters and setter

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
public void displyInmfo() {
	System.out.println("name"+name);
}

@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + "]";
}
 


}
