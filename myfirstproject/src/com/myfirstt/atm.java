package com.myfirstt;

public class atm {
	static String bankName = "State Bank of India";
	double accNum;
	double balance;

	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount credited " + amount);
	}

	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount debited" + amount);
	}

	void checkBalance() {
		System.out.println("current balance" + balance);
	}

	public static void main(String[] args) {
		atm a1 = new atm();
		a1.accNum = 23002301;
		a1.balance = 20000;
		a1.deposit(500);
		a1.checkBalance();
		a1.withdraw(10000);
		a1.checkBalance();
		System.out.println("________________________c");
		atm a2 = new atm();
		a2.accNum = 23002302;
		a2.balance = 30000;
		a2.deposit(500);
		a2.checkBalance();
		a2.withdraw(10000);
		a2.checkBalance();
	}

}
