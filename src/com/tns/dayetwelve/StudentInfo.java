package com.tns.dayetwelve;

public class StudentInfo {
	private int rollNo;
	private String name;
	private float per;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	public void show() {
		
		try {
			PercentageValidator.isvalidPercentage(per);
			System.out.println("student details: ");
			System.out.println("RollNo : " +rollNo +"\t Name :" +name +"\t per" +per);
		}catch(ArithmeticException e) {
			
			System.out.println("Invalid percentage");
		}
	}

}
