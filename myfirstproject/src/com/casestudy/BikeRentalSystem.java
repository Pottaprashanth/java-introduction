package com.casestudy;

import java.util.Scanner;

public class BikeRentalSystem {

	public static void main(String[] args) {
		double charge = 0;
		double ratePerHour = 50;
		double totalIncome = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Customers:");
		int nofc = sc.nextInt();
		for (int i = 1; i <= nofc; i++) {
			System.out.println("\n------ Customer " + i + "-------");
			System.out.println("Enter no of bikes customer:");
			int nofb = sc.nextInt();
			double customerBill = 0;
			int bike = 1;
			while (bike <= nofb) {
				System.out.println("Enter hours for bike " + bike + ": ");
				int nofh = sc.nextInt();
				charge = nofh * ratePerHour;

				if (nofh >= 5) {
					double discount = charge * 0.10;
					charge = charge - discount;

				}
				customerBill = customerBill + charge;
				System.out.println("Bike " + bike + " charge: " + charge);
				bike++;
			}

			System.out.println("Customer " + i + " Bill :" + customerBill);
			totalIncome += customerBill;
		}
		System.out.println("===============================");
		System.out.println("Total Income for the Day:" + totalIncome);
		System.out.println("================================");
	}

}
