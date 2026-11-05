package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(102,"Nani",50000);
           System.out.println(e1);
		System.out.println("Employee Id     : " + e1.getEid());
		System.out.println("Employee Name   : " + e1.getName());
		System.out.println("Employee Salary :" + e1.getSal());
		
		Employee e = new Employee();
		e.setEid(101);
		e.setName("chanti");
		e.setSal(100000);
	
		System.out.println("Employee Id     : " + e.getEid());
		System.out.println("Employee Name   : " + e.getName());
		System.out.println("Employee Salary :" + e.getSal());

//		e.empid=101;
//		e.name="Prashanth";
//		e.sal=1000000;
//		
//		System.out.println(e.empid);
//		System.out.println(e.name);
//		System.out.println(e.sal);
	}

}
