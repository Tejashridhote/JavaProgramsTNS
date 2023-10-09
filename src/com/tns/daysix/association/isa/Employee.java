//program to demonstrate usage of IS a Relationship
package com.tns.daysix.association.isa;

public class Employee {
	
	private String name;
	private int empId;
	private String dept;
	//constructors
	public Employee() {
		super();
	}
	public Employee(String name, int empId, String dept) {
		super();
		this.name = name;
		this.empId = empId;
		this.dept = dept;
	}
	//getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", dept=" + dept + "]";
	}
	
	
	
	

}
