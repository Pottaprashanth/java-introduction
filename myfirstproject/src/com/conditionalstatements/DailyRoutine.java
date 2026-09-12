package com.conditionalstatements;

import java.util.Scanner;

public class DailyRoutine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time");
		int t = sc.nextInt();
		if (t >= 5 && t <= 6) {
			System.out.println("GOOD MORNING..! HAVE A NICE DAY");

		} else if (t > 6 && t < 8) {
			System.out.println("Its Time to Breakfast And Go to Institute");
		} else if (t > 8 && t < 12) {
			System.out.println("Listen Classe and practice in lab");
		} else if (t >= 12 && t <= 13) {
			System.out.println("Complete Lunch");
		} else if (t > 13 && t < 15) {
			System.out.println("Take Breake And Sleep");
		} else if (t > 15 && t < 17) {
			System.out.println("Study Java And Practice");
		} else if (t > 17 && t < 19) {
			System.out.println("Study Sql And Practice");
		} else if (t >= 19 && t < 20) {
			System.out.println("Complete Dinner");

		} else if (t > 19 && t < 21) {
			System.out.println("Scroll Reels");
		} else {
			System.out.println("Sleep");
		}

	}
}
