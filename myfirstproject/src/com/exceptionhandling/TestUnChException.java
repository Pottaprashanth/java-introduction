package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUnChException {

	public static void main(String[] args) {
	
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number a:");
			int a=sc.nextInt();
		
			System.out.println("Enter Number b:");
			int b=sc.nextInt();
	try {
		
		System.out.println(a/b);
	}catch(ArithmeticException e){
		e.printStackTrace();
		
	}
		}catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
