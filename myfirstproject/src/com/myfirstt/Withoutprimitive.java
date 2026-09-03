package com.myfirstt;

public class Withoutprimitive {
	Integer StudentId;
	String StudentName;
	Character Gender;
	String BranchName;
	static String CollageName;

	void disply() {
		System.out.println("******* Student details ********");
		System.out.println("STUDENT ID   :" + StudentId);
		System.out.println("STUDENT NAME :" + StudentName);
		System.out.println("STUDENT GENDER :" + Gender);
		System.out.println("BRANCH NAME :" + BranchName);
		System.out.println("COLLAGE NAME :" + CollageName);
		System.out.println();
	}

	public static void main(String[] args) {

		Withoutprimitive wp = new Withoutprimitive();
		wp.StudentId = 101;
		wp.StudentName = "Tharun";
		wp.Gender = 'M';
		wp.BranchName = "cse";
		CollageName = "vcube";
		wp.disply();

		Withoutprimitive wp1 = new Withoutprimitive();
		wp1.StudentId = 101;
		wp1.StudentName = "Venkat Sai";
		wp1.Gender = 'M';
		wp1.BranchName = "ece";
		wp1.disply();

	}

}
