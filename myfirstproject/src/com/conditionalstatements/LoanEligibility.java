package com.conditionalstatements;

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your salary");
		double salary = sc.nextDouble();
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		if (salary >= 50000 && age >= 21 && age <= 60) {
			System.out.println("Eligible for Loan");
		} else if (salary >= 30000 && salary <= 49999) {
			System.out.println("May be Eligible for Loan");
		} else {
			System.out.println("Not Eligible for Loan");
		}

	}
}
