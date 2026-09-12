package com.conditionalstatements;

import java.util.Scanner;

public class NumPosNeg {

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Negative number");
		} else if (num == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Positive number");
		}

	}

}
