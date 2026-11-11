package com.oops;

import java.util.Scanner;

class Vehicle {
	static Scanner sc = new Scanner(System.in);
	private int vehicleNum;
	private String brand;
	private int rentPerDay;

	public Vehicle(int vehicleNum, String brand, int rentPerDay) {
		super();
		this.vehicleNum = vehicleNum;
		this.brand = brand;
		this.rentPerDay = rentPerDay;
	}

	public int getVehicleNum() {
		return vehicleNum;
	}

	void calculateRent(int days) {
		int totalRent = rentPerDay * days;
		System.out.println("Total Rent:" + totalRent);

	}

	public void setVehicleNum(int vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(int rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

}

class Car extends Vehicle {

	public Car(int vehicleNum, String brand, int rentPerDay) {
		super(vehicleNum, brand, rentPerDay);

	}

	@Override
	void calculateRent(int days) {
		int totalRent = getRentPerDay() * days;
		System.out.println("************* CAR RENTAL **********");
		System.out.println("Vehicle Number:" + getVehicleNum());
		System.out.println("Brand:" + getBrand());
		System.out.println("Rent pre day" + getRentPerDay());
		System.out.println("Total Rent:" + totalRent);

	}
}

class Bike extends Vehicle {
	public Bike(int vehicleNum, String brand, int rentPerDay) {
		super(vehicleNum, brand, rentPerDay);

	}

	@Override
	void calculateRent(int days) {
		int totalRent = getRentPerDay() * days;
		System.out.println("************* BIKE RENTAL **********");
		System.out.println("Vehicle Number:" + getVehicleNum());
		System.out.println("Brand:" + getBrand());
		System.out.println("Rent pre day:" + getRentPerDay());
		System.out.println("Total Rent:" + totalRent);
	}
}

public class Vrs {

	public static void main(String[] args) {
		Bike b = new Bike(123, "KTM", 1000);
		b.calculateRent(2);
		Car c = new Car(1431, "BMW", 3000);
		c.calculateRent(4);

	}

}
