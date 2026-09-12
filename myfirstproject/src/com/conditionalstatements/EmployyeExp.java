package com.conditionalstatements;

import java.util.Scanner;

public class EmployyeExp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Experience");
		int exp = sc.nextInt();
		if (exp == 0 && exp <= 1) {
			System.out.println("Fresher");
		} else if (exp >= 2 && exp <= 4) {
			System.out.println("Junior");
		} else if (exp >= 5 && exp <= 9) {
			System.out.println("Experienced");
		} else if (exp >= 10) {
			System.out.println("Senior");
		} else {
			System.out.println("Invalid Experience");
		}

	}

}
