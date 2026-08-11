package com.myfirstt;

public class Student {
     static String CollegeName;
     static String Location;
     
     int RollNo ;
     String Name;
     String Mobile;
     String Email;
     String Branch;
	public static void main(String[] args) {
		Student s=new Student();
		s.Name="Tharun";
		s.RollNo=1;
		s.Mobile="7680882258";
		s.Branch="CSE";
		s.Email="prashanth@gmail.com";
		CollegeName="Vardhaman";
		Location="Shamshabad";
		System.out.println("Student 1");
		System.out.println(s.Name);
		System.out.println(s.RollNo);
		System.out.println(s.Email);
		System.out.println(s.Branch);
		System.out.println(s.Mobile);
		System.out.println(CollegeName);
		System.out.println(Location);
		Student s1=new Student();
		System.out.println("Student 2");
		s1.Name="Prashanth";
		s1.RollNo=2;
		s1.Mobile="7680882258";
		s1.Branch="CSE";
		s1.Email="prashanth@gmail.com";
		System.out.println(s1.Name);
		System.out.println(s1.RollNo);
		System.out.println(s1.Email);
		System.out.println(s1.Branch);
		System.out.println(s1.Mobile);
		System.out.println(CollegeName);
		System.out.println(Location);
		
		
	}

}
