package com.myfirstt;

public class Methods {
	static String company = "V-Cube";
	static String companyAdress = "Hyderabad";
	int empId;
	String empAddress;
	String empName;
	String job;
	String hiredate;
	double sal;
	double comm;
	int experience;
	int deptno;
	double asal;
	double salwithcomm;
	double dsal;
	String email;
	long pno;
	static int count = 0;

	// method1
	void showEmpName() {
		System.out.println("Employee Name :" + empName);
	}

	// method2
	void showEmpId() {
		System.out.println("Employee Id :" + empId);
	}

	// method3
	void showEmpAddress() {
		System.out.println("Employee Address" + empAddress);
	}

	// method4
	void showEmpJob() {

		System.out.println("Employee Job:" + job);
	}

	// method5
	void showHireDate() {
		System.out.println("Joining Date :" + hiredate);

	}

	// method6
	void showEmpExperience() {

		System.out.println("Employee Experience :" + experience);

	}

	// method7
	void showSalary() {
		System.out.println("Employee Salary Per Month:" + sal);
	}

	// method8
	void showCommission() {
		System.out.println("Commission Earned by Employee :" + comm);
	}

	// method9
	void showCompanyName() {
		System.out.println("Company Name" + company);
	}

	// method10
	void displayEmpDetails() {
		System.out.println("Employee Name :" + empName);
		System.out.println("Employee Id :" + empId);
		System.out.println("Employee Address" + empAddress);
		System.out.println("Employee Job:" + job);
		System.out.println("Employee phone number:" + pno);
		System.out.println("Employee email:" + email);
	}

	// method11
	void showEmpDeptno() {
		System.out.println("Employee working in department :" + deptno);
	}

	// method12
	void annualSalary() {
		asal = sal * 12;
		System.out.println("Annual Salary of employee is :" + asal);
	}

	// method13
	void changeCompany() {
		company = "C-Cube";
		System.out.println("Updated Company Name:" + company);
	}

//method14
	void displayAllDetails() {
		System.out.println("Employee Name :" + empName);
		System.out.println("Employee Id :" + empId);
		System.out.println("Employee Address" + empAddress);
		System.out.println("Employee Job:" + job);
		System.out.println("Employee salary:" + sal);
		System.out.println("Employee experience:" + experience);
		System.out.println("Commission earned:" + comm);
		System.out.println("Department number" + deptno);
		System.out.println("Joining Date :" + hiredate);
		System.out.println("Company Name" + company);
		System.out.println("Annual Salary of employee is :" + asal);
		System.out.println("Employee phone number:" + pno);
		System.out.println("Employee email:" + email);
	}

	// method15
	void checkHighSalary() {
		if (sal > 100000) {
			System.out.println("Employee Earned High Salary");
		} else {
			System.out.println("Employee Earned Low Salary");
		}
	}

	// method16
	void checkLowSalary() {
		if (sal <= 50000) {
			System.out.println("Employee Earned Low Salary");
		} else {
			System.out.println("Employee Earned High Salary");
		}
	}

//method17
	void displaySalaryWithCommission() {
		salwithcomm = sal + comm;
		System.out.println("Salary with commission is:" + salwithcomm);
	}

	// method18
	void checkExperiencedEmployee() {
		if (experience > 1) {
			System.out.println("Employee is experienced with:" + experience);
		} else {
			System.out.println("Employee is fresher:" + experience);
		}
	}

//method19
	void checkFresher() {
		if (experience <= 0) {
			System.out.println(empName + " is fresher");
		}
	}

	// method 20;
	void checkSeniorEmployee() {
		if (experience > 5) {
			System.out.println(empName + " is senior employee");
		}
	}

//method21
	void displayEmployeeContact() {
		System.out.println("Employee phone number:" + pno);
		System.out.println("Employee email:" + email);
	}

	// method22
	void checkDepartment10() {
		if (deptno == 10) {
			System.out.println(empName + " Working in Department " + deptno);
		} else {
			System.out.println(empName + " Not in Department " + deptno);
		}

	}

	// method23
	void checkDepartment20() {
		if (deptno == 20) {
			System.out.println(empName + " Working in Department " + deptno);
		} else {
			System.out.println(empName + " Not in Department " + deptno);
		}

	}

	// method24
	void checkDepartment30() {
		if (deptno == 30) {
			System.out.println(empName + " Working in Department " + deptno);
		} else {
			System.out.println(empName + " Not in Department " + deptno);
		}

	}

	// method25
	void checkDepartment40() {
		if (deptno == 40) {
			System.out.println(empName + "Working in Department" + deptno);
		} else {
			System.out.println(empName + "Not in Department" + deptno);
		}

	}

//method26
	void displayEmployeeJobDetails() {
		System.out.println("Employee Name" + empName);
		System.out.println("Employee company" + company);
		System.out.println("Employee department" + deptno);
		System.out.println("Employee salary" + sal);
		System.out.println("Employee experience" + experience);
		System.out.println("Employee job" + job);
	}

	// method27
	void displayDepartmentAndJob() {
		System.out.println(empName + " Department Number is " + deptno + " and his job is " + job);
	}

	// method28
	void checkEmployeeWithCommission() {
		System.out.println(empName + " Earned commission is " + comm);
	}

	// method29
	void checkEmployeeWithjoindate() {
		System.out.println(empName + " is joining date  " + hiredate);
	}

	// method30
	void checkEmployeeId() {
		if (empId == 101 || empId == 102 || empId == 103) {
			System.out.println("employee Id " + empId + " is valid");

		} else {
			System.out.println("Invalid EmpId");
		}
	}

	// method31
	void displayCommissionStatus() {
		if (comm > 0) {
			System.out.println(empName + " received commission");
		} else {
			System.out.println(empName + " not received commission");
		}
	}

	// method32

	void displayEmployeeIdCard() {
		System.out.println("********* Employee Id card **********");
		System.out.println("Employee company       :" + company);
		System.out.println("Employee Name          :" + empName);
		System.out.println("Employee job           :" + job);
		System.out.println("Employee department no :" + deptno);
		System.out.println("Joining Date           :" + hiredate);
		System.out.println("Employee phone number  :" + pno);
		System.out.println("Employee email         :" + email);
		System.out.println("*************************************");
	}

	// method33
	void checkPromotionEligibility() {
		if (experience >= 3) {
			System.out.println(empName + " is eligible for promotion");

		} else {
			System.out.println(empName + " is not eligible for promotion");
		}
	}

//method34
	void daySalary() {
		dsal = sal / 30;
		System.out.println("Day wise salary of employee :" + dsal);

	}

//method35
	void displayDepartmentDetails() {
		System.out.println("Department No :" + deptno);
		System.out.println("Department Name :" + job);
	}

//method36
	void companyDetails() {
		System.out.println("Company Name : " + company);
		System.out.println("Company Address :" + companyAdress);
	}

//method37
	public static void main(String[] args) {

		Methods e1 = new Methods();
		e1.empName = "Bharath";
		e1.empId = 101;
		e1.empAddress = "Hyderabad";
		e1.job = "Software Developer";
		e1.hiredate = "10-01-2026";
		e1.experience = 0;
		e1.sal = 50000;
		e1.deptno = 10;
		e1.comm = 5000;
		e1.email = "bharath@gmail.com";
		e1.pno = 7860998857l;
		e1.checkPromotionEligibility();

//		e1.annualSalary();
//		e1.changeCompany();
//		e1.displayAllDetails();
//		e1.checkHighSalary();
//		e1.checkLowSalary();
//		e1.displaySalaryWithCommission();
//		e1.checkExperiencedEmployee();
		e1.displayEmployeeContact();
		Methods e2 = new Methods();
		e2.empName = "Diwakar";
		e2.empId = 102;
		e2.empAddress = "Pragathi Nagar";
		e2.job = "Associate Software Developer";
		e2.hiredate = "11-01-2026";
		e2.experience = 5;
		e2.sal = 100000;
		e2.deptno = 20;
		e2.comm = 10000;
		e2.checkEmployeeId();
		e2.displayCommissionStatus();
//		e2.checkFresher();
//		e2.displayEmployeeJobDetails();
//		e2.checkEmployeeWithCommission();

		Methods e3 = new Methods();
		e3.empName = "Vamshi";
		e3.empId = 103;
		e3.empAddress = "BiBiNagar";
		e3.job = "Web Developer";
		e3.hiredate = "15-02-2026";
		e3.experience = 3;
		e3.sal = 120000;
		e3.deptno = 30;
		e3.comm = 0;
//		e3.checkDepartment30();
//		e3.checkDepartment20();
//		e3.displayDepartmentAndJob();
//		e3.checkEmployeeId();
		e3.displayCommissionStatus();
		e3.displayEmployeeIdCard();
		e3.checkPromotionEligibility();
		e3.daySalary();
		e3.companyDetails();
	}

}
