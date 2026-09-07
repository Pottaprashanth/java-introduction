package com.methods;

import java.util.Scanner;

public class SbiBank {
	double accNumber;
	String customerName;
	double balance;

	double deposit(double amount) {
		return balance += amount;
	}

	double withdraw(double amount) {
		return balance -= amount;
	}

	void tranfer(SbiBank anotheracc, double amount) {
		balance -= amount;
		anotheracc.balance += amount;

	}

	double calculateIntrest(double rate) {
		return balance * rate / 100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SbiBank a1 = new SbiBank();
		SbiBank a2 = new SbiBank();
		System.out.println("Enter a Account Number :");
		sc.nextDouble();
		System.out.println("Enter a Account Holder Name :");
		sc.next();
		System.out.println("Enter Amount to Deposit");
		double d = sc.nextDouble();
		System.out.println("Credited Amount :" + d);
		System.out.println("Cuttent Balance : " + a1.deposit(d));
		System.out.println("Enter Amount to Withdraw");
		double w = sc.nextDouble();
		System.out.println("Debited Amount :" + w);
		System.out.println("Cuttent Balance : " + a1.withdraw(w));
		System.out.println("Enter Second Account Balance :");
		a2.balance = sc.nextDouble();
		System.out.println("Enter Transfer Amount:");
		double t = sc.nextDouble();
		a1.tranfer(a2, t);
		System.out.println("Account 1 Balance:" + a1.balance);
		System.out.println("Account 2 Balance:" + a2.balance);
		System.out.println("Enter Intrest Rate:");
		double r = sc.nextDouble();
		System.out.println("Intrest:" + a1.calculateIntrest(r));

	}

}
