package com.arrays;

public class Student{
	int id;
	String name;
	public static void main(String[] args) {
	Student[] st=new Student[2];
	st[0]=new Student();
	st[0].id=1;
	st[0].name="Prashanth";
	
	st[1]=new Student();
	st[1].id=2;
	st[1].name="Tharun";
	
	for(int i=0;i<st.length;i++) {
		System.out.println(st[i].id);
		System.out.println(st[i].name);
	}
	}
}
