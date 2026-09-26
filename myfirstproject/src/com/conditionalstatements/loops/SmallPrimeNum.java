package com.conditionalstatements.loops;

import java.util.Scanner;

public class SmallPrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number:");
		int start = sc.nextInt();
		System.out.println("Enter End Number:");
		int end = sc.nextInt();
		for (int i = start; i < end; i++) {
			boolean status = true;
			if (i < 2) {
				status = false;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					status = false;
					break;
				}

			}
			if (status) {
				System.out.println("Smallest Prime Number is " + i);
				break;
			}
		}

	}

}
