package com.conditionalstatements.loops;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int s = sumofdigits(n);
		System.out.println("Sum of digits is:" + s);
	}

	private static int sumofdigits(int n) {
		int sum = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		return sum;

	}

}
