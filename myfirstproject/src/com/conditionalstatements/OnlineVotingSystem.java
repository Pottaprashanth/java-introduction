package com.conditionalstatements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age:");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Enter your Gender M/F:");
			String gender = sc.next();
			if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
				System.out.println("Enter your voterid:");
				int vid = sc.nextInt();

				System.out.println("Select option below to Vote:");
				System.out.println("1 for BRS ");
				System.out.println("2 for BJP ");
				System.out.println("3 for CPM ");
				System.out.println("4 for Congress");
				int op = sc.nextInt();
				if (op == 1) {
					System.out.println("Vote is captured for BRS.");
				} else if (op == 2) {
					System.out.println("Vote is captured for BJP.");
				} else if (op == 3) {
					System.out.println("Vote is captured for CPM.");
				} else if (op == 4) {
					System.out.println("Vote is captured for Congress.");
				} else {
					System.out.println("Thanks for Voting to NOTA.");
				}
			} else {
				System.out.println(" Gender Not Eligible");
			}
		} else {
			System.out.println("Not Eligible vote");
		}

	}

}
