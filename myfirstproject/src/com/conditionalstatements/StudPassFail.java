package com.conditionalstatements;

import java.util.Scanner;

public class StudPassFail {

	public static void main(String[] args) {
		System.out.println("Enter marks:");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks < 40) {
			System.out.println("fail");
		} else if (marks > 40 && marks < 100) {
			System.out.println("Pass");
		} else {
			System.out.println("Invalid marks");
		}
	}

}
