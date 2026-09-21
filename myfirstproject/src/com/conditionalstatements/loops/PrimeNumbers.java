package com.conditionalstatements.loops;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print  prime numbers:");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
			}
		}

	}

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

}
