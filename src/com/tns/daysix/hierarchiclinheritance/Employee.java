package com.tns.daysix.hierarchiclinheritance;

public class Employee extends Person
{
	private float salary;
	private int empId;
	private String dept;
	
	public Employee() {
		System.out.println("employee default construtor");
	}

	public Employee(float salary, int empId, String dept) {
	
		this.salary = salary;
		this.empId = empId;
		this.dept = dept;
	}
	public Employee(String name,String city,float salary, int empId, String dept) {
		super(name,city);
		this.salary = salary;
		this.empId = empId;
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
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
		return "Employee [salary=" + salary + ", empId=" + empId + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
