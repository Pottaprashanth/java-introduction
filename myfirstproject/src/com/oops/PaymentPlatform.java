package com.oops;

import java.util.Scanner;

class Payment {
	static Scanner sc = new Scanner(System.in);
	String CustomerName;
	double amount;

	public Payment(String customerName, double amount) {
		super();
		this.CustomerName = customerName;
		this.amount = amount;
	}

	void makePayment() {
		System.out.println("Payment in  process.......");
	}

}

class UPIPayment extends Payment {
	String upiId;

	public UPIPayment(String customerName, double amount, String upiId) {
		super(customerName, amount);
		this.upiId = upiId;
	}

	@Override
	void makePayment() {
		System.out.println("Enter your UPI ID:");
		String upi = sc.next();
		if (upiId.equals(upi)) {
			System.out.println("------------UPI Payment--------------");
			System.out.println("Cutomer Name:" + CustomerName);
			System.out.println("Amount:" + amount);
			System.out.println("UPI Payment is successfully completed");
			System.out.println("--------------------------------------");
		} else {
			System.out.println("Payment failed");
		}

	}
}

class CardPayment extends Payment {
	String cvv;
	String cardNum;

	public CardPayment(String customerName, double amount, String cvv, String cardNum) {
		super(customerName, amount);
		this.cvv = cvv;
		this.cardNum = cardNum;
	}

	@Override
	void makePayment() {
		System.out.println("Enter your card number:");
		String cardnum = sc.next();
		System.out.println("Enter your Cvv:");
		String c = sc.next();

		if (cvv.equals(c) && cardNum.equals(cardnum) && c.matches("\\d{3}")) {
			System.out.println("---------- CARD Payment --------------");
			System.out.println("Cutomer Name:" + CustomerName);
			System.out.println("Amount:" + amount);
			System.out.println("CARD Payment is successfully completed");
			System.out.println("--------------------------------------");

		} else {
			System.out.println("Payment failed. Please enter check card details");
		}
	}
}

class CashPayment extends Payment {
	public CashPayment(String customerName, double amount) {
		super(customerName, amount);

	}

	@Override
	void makePayment() {
		System.out.println("Enter cash amount:");
		double cash = sc.nextDouble();

		if (cash <= amount) {

			double balance = amount - cash;
			System.out.println("-------------- Cash Payment ----------");
			System.out.println("Cutomer Name:" + CustomerName);
			System.out.println("Amount:" + amount);
			System.out.println("Cash Received: " + cash);
			System.out.println("Remaining Balance: " + balance);
			System.out.println("Cash Payment is successfully completed");
			System.out.println("--------------------------------------");
		} else {

			System.out.println("Insufficient Cash");
			System.out.println("Shortage: " + (amount - cash));
		}
	}
}

public class PaymentPlatform {

	public static void main(String[] args) {
		Scanner pp = new Scanner(System.in);
		UPIPayment u = new UPIPayment("Prashanth", 5000, "1234");

		CardPayment cp = new CardPayment("Chanti", 3000, "111", "121314");

		CashPayment c = new CashPayment("anudeep", 6000);

		System.out.println("Choose your Payment Method:");
		System.out.println("1.Upi Payment");
		System.out.println("2.Card Payment");
		System.out.println("3.Cash Payment");
		int ch = pp.nextInt();

		switch (ch) {
		case 1 -> {
			u.makePayment();
		}
		case 2 -> {
			cp.makePayment();
		}
		case 3 -> {
			c.makePayment();
		}
		default -> {
			System.out.println("Enter valid Pament method");
		}

		}

	}

}
