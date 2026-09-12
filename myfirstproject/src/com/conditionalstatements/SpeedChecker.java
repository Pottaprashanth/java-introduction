package com.conditionalstatements;

import java.util.Scanner;

public class SpeedChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Speed to check:");
		int speed = sc.nextInt();
		if (speed >= 0 && speed <= 40) {
			System.out.println("Slow");
		} else if (speed >= 41 && speed <= 60) {
			System.out.println("Normal");

		} else if (speed >= 61 && speed <= 80) {
			System.out.println("Fast");

		} else if (speed >= 80) {
			System.out.println("Overspeeding");
		} else {
			System.out.println("Invalid Speed");
		}

	}
}
