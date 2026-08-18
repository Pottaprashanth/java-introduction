package com.myfirstt;

public class Employees {
	static int c=0;
     int employeeId;
     String employeeName;
     int salary;
     int experience;
     String grade;
     String permanentStatus;
     
     void display() {
    	 c++;
    	 System.out.println("******** Employee"+ " "+ c + " " +"details ********");
    
    	 System.out.println("Employee Id      :"+employeeId);
    	 System.out.println("Employee Name    :"+employeeName);
    	 System.out.println("Employee Salary  :"+salary);
    	 System.out.println("Employee Grade   :"+grade);
    	 System.out.println("Permanent Status :"+permanentStatus);
    	 System.out.println();
     }
	public static void main(String[] args) {
		Employees e1=new Employees();
		e1.employeeId=101;
		e1.employeeName="Tharun";
		e1.salary=150000;
		e1.grade="A";
		e1.permanentStatus="PERMANENT";
		e1.display();
		Employees e2=new Employees();
		e2.employeeId=102;
		e2.employeeName="Sai";
		e2.salary=100000;
		e2.grade="B";
		e2.permanentStatus="PERMANENT";
		e2.display();
		Employees e3=new Employees();
		e3.employeeId=103;
		e3.employeeName="Sanjay";
		e3.salary=90000;
		e3.grade="C";
		e3.permanentStatus="PERMANENT";
		e3.display();
	}

}
