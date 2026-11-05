package com.oops;

public class Employee {
	
	private int empid;
	private String name;
	private double sal;
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}
	Employee(){
		
	}
	public Employee(int empid, String name, double sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	public void setEid( int empid) {
		this.empid=empid;
	}
	public int getEid() {
		return empid;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setSal(double sal) {
		this.sal=sal;
	}
	public double getSal() {
		return sal;
	}

}
