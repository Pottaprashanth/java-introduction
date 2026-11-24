package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingException {

	public static void main(String[] args) {
		try {
			int totalMarks = 100;	
			int nofsub = 0;
			int avg = totalMarks / nofsub;
			System.out.println(avg);

		} catch (ArithmeticException a) {
			a.printStackTrace();
		}

		try {
			String[] students = { "prashnath", "Venkat", "Tharun", "sanjay" };
			System.out.println(students[5]);
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();

		}
		try {
			String username = "prashanth";
			System.out.println(username.charAt(8));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException np) {
			np.printStackTrace();
		}

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your marks:");
			int m = sc.nextInt();
			System.out.println(m);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
