package com.tns.daysix.association.isa;

//subclass inheriting from Employee
public class Manager extends Employee {
	
	private int teamsize;
	//constructor
	public Manager() {
		super();
	}
	public Manager(String name,int empId,String dept,int teamsize) {
		super(name,empId,dept);
		this.teamsize = teamsize;
	}
	//getters and setters
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	@Override
	public String toString() {
		return "Manager [teamsize=" + teamsize + ", getName()=" + getName() + ", getEmpId()=" + getEmpId()
				+ ", getDept()=" + getDept() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	

	

}
