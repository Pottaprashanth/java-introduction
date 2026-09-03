package com.myfirstt;

import java.util.Scanner;

public class bank {
	static double balance = 10000;
	double accNum = 200034040;

	public static void main(String[] args) {
		showBalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposite:");
		double amount = sc.nextDouble();

		deposit(amount);
		showBalance();

		System.out.println("Enter amount to withdraw:");
		double amount1 = sc.nextDouble();
		withdraw(amount1);
		showBalance();

	}

	static void withdraw(double amount1) {
		balance = balance - amount1;
		System.out.println("Amount Debited:" + amount1);

	}

	static void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount credited:" + amount);
	}

	static void showBalance() {
		System.out.println("current Balance :" + balance);
	}

}
