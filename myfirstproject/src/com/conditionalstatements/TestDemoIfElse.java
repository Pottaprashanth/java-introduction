package com.conditionalstatements;

import java.util.Scanner;

public class TestDemoIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks:");
		int marks = sc.nextInt();
		if (marks > 100 || marks < 0) {
			System.out.println("Invalid Marks");
		} else if (marks > 90 && marks < 100) {
			System.out.println("GRADE A");
		} else if (marks > 75 && marks < 89) {
			System.out.println("GRADE B");
		} else if (marks > 60 && marks < 74) {
			System.out.println("GRADE C");
		} else if (marks > 40 && marks < 59) {
			System.out.println("GRADE D");
		} else {
			System.out.println("FAILED");
		}
	}
}
