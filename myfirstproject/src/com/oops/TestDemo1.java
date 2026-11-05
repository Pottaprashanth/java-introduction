package com.oops;

class users {

	String username;
	String password;

//	public users(String username, String password) {
//		super();
//		this.username = username;
//		this.password = password;
//	}

	void login() {
		System.out.println(username + " Login Succcessfull!");

	}
	
	void displayRole() {
		System.out.println("User Role");
	}

//	String getUsername() {
//		return username;
//
//	}

}

class Admins extends users {
//	Admins(String username, String password) {
//		super(username, password);
//
//	}

	void manageUser() {
		System.out.println(username + " Managing users.");
	}
	@Override
	void displayRole() {
		System.out.println("Admin Role");
	}
}

class Instructors extends users {

//	Instructors(String username, String password) {
//		super(username, password);
//	}

	void createCourse() {
		System.out.println(username + " created a Java Course.");
	}
	@Override
	void displayRole() {
		System.out.println("Instructors Role");
	}
}

class Students extends users {
//	Students(String username, String password) {
//		super(username, password);
//	}

	void submitAssignment() {
		System.out.println(username + " Submitted the Assignment");
	}
	@Override
	void displayRole() {
		System.out.println("Students Role");
	}
	
}

public class TestDemo1 {

	public static void main(String[] args) {
		Students s=new Students();
		s.username="Prashanth";
		s.password="1234";
		Instructors i=new Instructors();
		i.username="Srikanth";
		i.password="1245";
		Admins a=new Admins();
		a.username="bhanu";
		a.password="3455";
		
		System.out.println("------- STUDENT ------");
		s.login();
		s.displayRole();
		s.submitAssignment();
		
		System.out.println("------- INSTRUCTOR ------");
		i.login();
		i.displayRole();
		i.createCourse();
		
		System.out.println("------- ADMIN ------");
		a.login();
		i.displayRole();
		a.manageUser();



	}

}
