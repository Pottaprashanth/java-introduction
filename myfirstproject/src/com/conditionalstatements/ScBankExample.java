package com.conditionalstatements;

import java.util.Scanner;

public class ScBankExample {
	static double balance = 100000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("******** ATM MENU ********");
			System.out.println("1. Check Balance.");
			System.out.println("2. Deposite.");
			System.out.println("3. Withdraw.");
			System.out.println("4. EXIT..!!.");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Current Balance:" + balance);
				break;
			}
			case 2: {
				System.out.println("Enter Deposite Amount:");
				double depositeAmount = sc.nextDouble();
				System.out.println("Deposite Amount:" + depositeAmount);
				System.out.println("Current Balance:" + (balance + depositeAmount));
				break;
			}
			case 3: {
				System.out.println("Enter Withdraw Amount:");
				double withdrawAmount = sc.nextDouble();
				if (withdrawAmount > balance) {
					System.out.println("Insufficent Funds");
				}
				System.out.println("withdraw Amount:" + withdrawAmount);
				System.out.println("Current Balance:" + (balance - withdrawAmount));
				break;
			}
			case 4: {
				System.out.println("Thank you visit Again...!!!");
				break;
			}
			default: {
				System.out.println("Invalid Choice");
				break;
			}
			}
		} while (choice != 4);
	}

}
