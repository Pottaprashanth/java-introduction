package com.conditionalstatements.loops;

import java.util.Scanner;

public class Primeornot {
	static boolean isPrime(int n) {
		boolean flag = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number is prime numbers or not:");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println("Number is Prime Number");
		} else {
			System.out.println("Number is not Prime Number");
		}

	}

}
