package com.casestudy;

import java.util.Scanner;

public class OnlineHospitalAppointmentBookingsystem {

	static void regularAppointment(int appavail) {

		if (appavail == 1) {
			System.out.println("Regular Appointment Confirmed");
		} else if (appavail == 2) {
			System.out.println("Please Select Another Slot");
		} else {
			System.out.println("Invalid Availability");
		}
	}

	static void emergencyAppointment(int appavail) {

		if (appavail == 1) {
			System.out.println("Emergency Appointment Confirmed");
		} else if (appavail == 2) {
			System.out.println("Emergency Slot Not Available");
		} else {
			System.out.println("Invalid Availability");
		}
	}

	static void bookAppointment(int age, int ptype, int appavail) {

		if (age < 0) {
			System.out.println("Invalid Age");
		} else if (age < 18) {
			System.out.println("Patient must be 18 or above");
		} else if (ptype == 1) {
			regularAppointment(appavail);
		} else if (ptype == 2) {
			emergencyAppointment(appavail);
		} else {
			System.out.println("Invalid Patient Type");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age:");
		int age = sc.nextInt();

		System.out.println("Select Patient Type:");
		System.out.println("1. Regular");
		System.out.println("2. Emergency");
		int ptype = sc.nextInt();

		System.out.println("Appointment Availability:");
		System.out.println("1. Available");
		System.out.println("2. Not Available");
		int appavail = sc.nextInt();

		bookAppointment(age, ptype, appavail);

	}
}