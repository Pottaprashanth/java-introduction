package com.conditionalstatements.loops;

import java.util.Scanner;

public class FactofNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		
		// factofnum(n);

		int result = factnum(n);
		System.out.println("highest fac:" + result);
	}

	private static int factnum(int n) {
		int fac = 0;
		System.out.println("factotrs:");
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				fac = i;
				System.out.println(i);
			}

		}
		return fac;

	}

//	private static void factofnum(int n) {
//	for(int i=1;i<=n/2;i++) {
//		if(n%i==0) {
//			System.out.println(i+" ");
//		}
//	}
//		
//	}

}
