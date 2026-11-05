package com.casestudy;

import java.util.Scanner;

public class ShoppingCartBillingSystem {
	String productName;
	double productPrice;
	int quantity;
	
	ShoppingCartBillingSystem(String productName,double productPrice,int quantity){
		this.productName=productName;
		this.productPrice=productPrice;
		this.quantity=quantity;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Products:");
		int n=s.nextInt();
		s.nextLine();
		for(int i=1;i<n;i++) {
			System.out.println("Enter Product-"+i);
			System.out.println("Enter Products Name:");
			String p=s.nextLine();
			System.out.println("Enter Products Price:");
			double pp=s.nextDouble();
			System.out.println("Enter Products Quantity:");
			int q=s.nextInt();
			ShoppingCartBillingSystem sc=new ShoppingCartBillingSystem(p, pp, q);
			
			
		}
		
		
		

	}

}
