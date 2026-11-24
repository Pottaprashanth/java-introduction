package com.exceptionhandling;

import java.util.Scanner;

public class TestUnChException3 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number a:");
			int a = sc.nextInt();
			System.out.println("Enter Number b:");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Enter a Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println(name.charAt(c));
		} catch (ArithmeticException ae) {
			System.err.println("In AE");
			// ae.printStackTrace();
		} catch (StringIndexOutOfBoundsException se) {
			System.err.println("In SE");
			// se.printStackTrace();
		}

	}

}
