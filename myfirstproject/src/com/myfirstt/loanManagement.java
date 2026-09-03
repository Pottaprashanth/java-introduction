package com.myfirstt;

public class loanManagement {

	String customerName;
	double loanAmount;
	double intrestRate;
	int loneTenure;
	double intrest;
	double totalAmount;
	double emi;

	double calculateIntrest(double loanAmount, double intrestRate, double loneTenure) {
		intrest = (loanAmount * intrestRate * loneTenure) / 100;
		return intrest;
	}

	double calculateTotalAmount(double loneAmount, double intrestRate) {

		totalAmount = loanAmount + intrest;
		return totalAmount;
	}

	double calculateMonthlyEMI(double totalAmount, double loneTenure) {
		emi = totalAmount / (loneTenure * 12);
		return emi;
	}

	void displyLoanSummary(String customerName, double loanAmount, double intrestRate, int loneTenure, double intrest,
			double totalAmunt, double emi) {
		System.out.println("************ LOAN SUMMARY ************");
		System.out.println("Customer Name:" + customerName);
		System.out.println("Loan Amount  :" + loanAmount);
		System.out.println("Intrest Rate :" + intrestRate);
		System.out.println("Lone Tenure  :" + loneTenure);
		System.out.println("Intrest      :" + intrest);
		System.out.println("Total Amount :" + totalAmount);
		System.out.println("Monthly EMI  :" + emi);
		System.out.println("************ Thank You *************");
	}

	public static void main(String[] args) {

		loanManagement l1 = new loanManagement();
		l1.customerName = "Diwakar";
		l1.loanAmount = 100000;
		l1.intrestRate = 5.5;
		l1.loneTenure = 3;
		double intrest1 = l1.calculateIntrest(l1.loanAmount, l1.intrestRate, l1.loneTenure);
		double totalAmt = l1.calculateTotalAmount(l1.loanAmount, l1.intrestRate);
		l1.calculateMonthlyEMI(totalAmt, l1.loneTenure);
		l1.displyLoanSummary(l1.customerName, l1.loanAmount, l1.intrestRate, l1.loneTenure, intrest1, totalAmt, l1.emi);
		loanManagement l2 = new loanManagement();
		l2.customerName = "sai sanjay";
		l2.loanAmount = 200000;
		l2.intrestRate = 3.4;
		l2.loneTenure = 5;
		double intrest2 = l2.calculateIntrest(l2.loanAmount, l2.intrestRate, l2.loneTenure);
		double totalAmt1 = l2.calculateTotalAmount(l2.loanAmount, l2.intrestRate);
		l2.calculateMonthlyEMI(totalAmt1, l2.loneTenure);
		l2.displyLoanSummary(l2.customerName, l2.loanAmount, l2.intrestRate, l2.loneTenure, intrest2, totalAmt1,
				l2.emi);

	}

}
