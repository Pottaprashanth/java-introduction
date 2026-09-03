package com.myfirstt;

public class ZoomCarRentals {
	int days;

	String getCompanyName() {
		return "Zoom Car Rentals";

	}

	int baseRental() {
		return 1500;

	}

	int baseRentalCost() {

		return baseRental() * days;

	}

	int fixedInsurence() {
		return 500;

	}

	int totalCost() {

		return baseRentalCost() + fixedInsurence();

	}

	static {

		System.out.println("Welcome to zoom car rentals");

	}

	public static void main(String[] args) {

		ZoomCarRentals c1 = new ZoomCarRentals();
		c1.days = 5;

		System.out.println("Base Rental Per Day :" + c1.baseRental());
		System.out.println("Base Rental Number of Day:" + c1.baseRentalCost());
		System.out.println("Fixed Insurunce:" + c1.fixedInsurence());
		System.out.println("Total Cost:" + c1.totalCost());
	}

}
