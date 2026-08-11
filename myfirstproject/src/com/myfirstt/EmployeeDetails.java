package com.myfirstt;

public class EmployeeDetails {
	static String departmentName;
	static String location;
	
	int emp_id;
	String name;
	String mobile ;
	String email;
	public static void main(String[] args) {
	EmployeeDetails e1=new EmployeeDetails();
	e1.emp_id=101;
	e1.name="Tharun suriya";
	e1.mobile="7689083791";
	e1.email="tharun@gmail.com";
	departmentName="cse";
	location="KPHP";
	System.out.println("********* Employee 1 Details ***********");
	System.out.println("DEPARTMENT NAME :"+ departmentName);
	System.out.println("LOCATION :" + location);
	System.out.println("EMPLOYEE ID :"+ e1.emp_id);
	System.out.println("EMPLOYEE NAME :"+e1.name);
	System.out.println("EMPLOYEE MOBILE NUMBER :"+e1.mobile);
	System.out.println("EMPLOYEE EMAIL :"+e1.email);
	System.out.println("******************************************");
	
	EmployeeDetails e2=new EmployeeDetails();
	e2.emp_id=102;
	e2.name="surya";
	e2.mobile="76890003791";
	e2.email="surya@gmail.com";
	
	System.out.println("********* Employee 2 Details ***********");
	System.out.println("DEPARTMENT NAME :"+ departmentName);
	System.out.println("LOCATION :" + location);
	System.out.println("EMPLOYEE ID :"+ e2.emp_id);
	System.out.println("EMPLOYEE NAME :"+e2.name);
	System.out.println("EMPLOYEE MOBILE NUMBER :"+e2.mobile);
	System.out.println("EMPLOYEE EMAIL :"+e2.email);
	System.out.println("******************************************");
	
	EmployeeDetails e3=new EmployeeDetails();
	e3.emp_id=103;
	e3.name="hari";
	e3.mobile="76890003791";
	e3.email="hari@gmail.com";
	
	System.out.println("********* Employee 3 Details ***********");
	System.out.println("DEPARTMENT NAME :"+ departmentName);
	System.out.println("LOCATION :" + location);
	System.out.println("EMPLOYEE ID :"+ e3.emp_id);
	System.out.println("EMPLOYEE NAME :"+e3.name);
	System.out.println("EMPLOYEE MOBILE NUMBER :"+e3.mobile);
	System.out.println("EMPLOYEE EMAIL :"+e3.email);
	System.out.println("******************************************");
		
	EmployeeDetails e4=new EmployeeDetails();
	e4.emp_id=104;
	e4.name="Jaswanth";
	e4.mobile="768003791";
	e4.email="jaswanth@gmail.com";
	departmentName="IT";
    location="JNTU";
	System.out.println("********* Employee 4 Details ***********");
	System.out.println("DEPARTMENT NAME :"+ departmentName);
	System.out.println("LOCATION :" + location);
	System.out.println("EMPLOYEE ID :"+ e4.emp_id);
	System.out.println("EMPLOYEE NAME :"+e4.name);
	System.out.println("EMPLOYEE MOBILE NUMBER :"+e4.mobile);
	System.out.println("EMPLOYEE EMAIL :"+e4.email);
	System.out.println("******************************************");
			
	EmployeeDetails e5=new EmployeeDetails();
	e5.emp_id=105;
	e5.name="uday";
	e5.mobile="768003791";
	e5.email="uday@gmail.com";

	System.out.println("********* Employee 4 Details ***********");
	System.out.println("DEPARTMENT NAME :"+ departmentName);
	System.out.println("LOCATION :" + location);
	System.out.println("EMPLOYEE ID :"+ e5.emp_id);
	System.out.println("EMPLOYEE NAME :"+e5.name);
	System.out.println("EMPLOYEE MOBILE NUMBER :"+e5.mobile);
	System.out.println("EMPLOYEE EMAIL :"+e5.email);
	System.out.println("******************************************");
		
		
		
	}

}
