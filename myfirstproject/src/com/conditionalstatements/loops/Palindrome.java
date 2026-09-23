package com.conditionalstatements.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome:");
		int n = sc.nextInt();
		boolean p = isPalindrome(n);
		if (p) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

	}

	private static boolean isPalindrome(int n) {
		boolean status = false;
		int r = 0;
		int rev = 0;
		int temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		if (temp == rev) {
			status = true;
		}
		return status;
	}

}
