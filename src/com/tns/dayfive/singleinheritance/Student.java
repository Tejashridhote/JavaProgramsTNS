//program to demonstrate single inheritance
package com.tns.dayfive.singleinheritance;

//creating child class
public class Student extends Citizen
{
   private int rollNo;
   private String collegeName;
   
   public Student()
   {
	   super();
   }
	public Student(String name,String aadharNo,String address,long phNo,int rollNo,String collegeName) {
		super(name,aadharNo,address,phNo); //accessing parent class construtor
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAadharno()=" + getAadharno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
