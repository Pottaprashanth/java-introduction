package com.myfirstt;

public class Mobile {
	
	 static String brand;
	static String mobileName ;
	 String model;
	 int price;
	 String ram;
    
	 static {
		 System.out.println("welcome to Apple store");
	 }
	 
	 {
		 System.out.println("New Arravils");
	 }
	 
	 static void display1() {
		 System.out.println("Special Discounts");
		 
	 }
	  void display() {
		 System.out.println("******* Mobiles *******");
		 System.out.println("BRAND NAME :"+ brand);
		 System.out.println("MOBILE NAME :"+ mobileName);
		 System.out.println("MODEL :"+ model);
		 System.out.println("MOBILE NAME :"+ mobileName);
		 System.out.println("PRICE :"+ price);
		 System.out.println("RAM :"+ ram);
		 System.out.println();
	 }

	public static void main(String[] args) {
		
		Mobile m1=new Mobile();
		brand="Apple";
		mobileName="I Phone";
		m1.model="16 Pro";
		m1.price=80000;
		m1.ram="8GB";
		m1.display();
		display1();
		Mobile m2=new Mobile();
		m2.model="17 Pro max";
		m2.price=100000;
		m2.ram="16 GB";
		m2.display();
		display1();
		Mobile m3=new Mobile();
		m3.model="18 Pro max";
		m3.price=150000;
		m3.ram="24 GB";
		m3.display();
		display1();
		
	}

}
