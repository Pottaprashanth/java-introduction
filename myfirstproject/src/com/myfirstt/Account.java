package com.myfirstt;

public class Account {
	static int count = 1090011002;
	String name;
	int accountNumber;
	int Balance;
	String AccountStatus;

	void accountDetails() {
		count++;
		System.out.println("********* ACCOUNT DETAILS ************");
		System.out.println("ACCOUNT HOLDER NAME :" + name);
		System.out.println("ACCOUNT NUMBER      :" + count);
		System.out.println("ACCOUNT BALANCE     :" + Balance);
		System.out.println("ACCOUNT STATUS      :" + AccountStatus);
	}

	public static void main(String[] args) {

		Account a1 = new Account();
		a1.name = "RAVI";
		a1.Balance = 50000;
		a1.AccountStatus = "ACTIVE";
		a1.accountDetails();
		Account a2 = new Account();
		a2.name = "RAJU";
		a2.Balance = 150000;
		a2.AccountStatus = "ACTIVE";
		a2.accountDetails();
		Account a3 = new Account();
		a3.name = "YASWANTH";
		a3.Balance = 150000;
		a3.AccountStatus = " IN ACTIVE";
		a3.accountDetails();
	}

}
