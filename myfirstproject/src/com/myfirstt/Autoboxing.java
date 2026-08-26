package com.myfirstt;

public class Autoboxing {

	public static void main(String[] args) {
		int n = 100;
		Integer n1 = n;
		System.out.println("Converting primative data to wrapper obj :"+n1);

		Integer n2 = 200;
		int a = n2;
		System.out.println("Converting wrapper obj to  primative data :"+a);

		int id = 101;
		double marks = 95.5;
		char grade = 'A';
		String name = "Tharun";
		Boolean passfail = true;

		System.out.println("Integer literal :" + id);
		System.out.println("float literal   :" + marks);
		System.out.println("char literal    :" + grade);
		System.out.println("string literal  :" + name);
		System.out.println("Boolean literal :" + passfail);

	}

}
