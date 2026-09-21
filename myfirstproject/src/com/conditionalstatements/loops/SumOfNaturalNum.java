package com.conditionalstatements.loops;

import java.util.Scanner;

public class SumOfNaturalNum {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
			}
		}

		System.out.println(sum);
	}

}
