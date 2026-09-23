package com.conditionalstatements.loops;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int rev = RevofNum(n);
		System.out.println("Reverse of number is:" + rev);
	}

	private static int RevofNum(int n) {
		int rev = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		return rev;
	}

}
