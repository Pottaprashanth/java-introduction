package com.conditionalstatements.loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
//		for (int i = 1; i < n; i++) {
//			if (n % i == 0) {
//				sum = sum + i;
//			}
//
//		}
//		if (sum == n) {
//			System.out.println("Number is Perfect");
//		} else {
//			System.out.println("Number not Perfect");
//		}

		boolean status = isPerfect(n);
		if (status) {
			System.out.println("Number is Perfect");
		} else {
			System.out.println("Number not Perfect");
		}

	}

	private static boolean isPerfect(int n) {
		int sum = 0;
		boolean status = false;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			status = true;
		}
		return status;

	}

}
