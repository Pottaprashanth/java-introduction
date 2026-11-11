package com.oops;

class Device {
	private String brand;
	private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	void displayDetails() {
		System.out.println("Brand :" + brand);
		System.out.println("Price :" + price);

	}

}

class Laptop extends Device {
	String ram;
	String processer;

	@Override
	void displayDetails() {
		System.out.println("********* Laptop details ********");
		super.displayDetails();
		System.out.println("Ram :" + ram);
		System.out.println("Processer :" + processer);
	}
	void cunIDE() {
		System.out.println("Cun IDE");
	}
	void compliecode() {
		System.out.println("Compile code");
	}

}

class Mobile extends Device {
	
	String camara;
	int battery;
	@Override
	void displayDetails() {
		System.out.println("********* Mobile details ********");
		super.displayDetails();
		System.out.println("Camara :" + camara);
		System.out.println("Battery :" + battery);
	}
	void makeCall() {
		System.out.println("calling");
	}
	void takePhoto() {
		System.out.println("smile please , Photo captured");
	}
	

}

public class TestDemoDevice {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.setBrand("DELL");
		l.setPrice(50000);
		l.ram="i5";
		l.processer="Intel";
		l.displayDetails();
		l.cunIDE();
		l.compliecode();
		
		Mobile m=new Mobile();
		m.setBrand("I phone 19 Pro Max");
		m.setPrice(100000);
		m.camara="50 Mega Pixles";
		m.battery=100;
		m.displayDetails();
		m.makeCall();
		m.takePhoto();
		
	

	}

}
