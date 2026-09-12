package com.conditionalstatements;

import java.util.Scanner;

public class LargestOf2Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A:");
		int a = sc.nextInt();
		System.out.println("Enter B:");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("A is Greater than B");
		} else if (a == b) {
			System.out.println("A, B are Equal");
		} else {
			System.out.println("A is less than B");
		}

	}

}
