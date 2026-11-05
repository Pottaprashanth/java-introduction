package com.arrays;

public class ShoppingBill {

	public static void main(String[] args) {
		int[] products = { 1500, 500, 400, 5000, 10000 };
		int total = 0;
		int maxProd = products[0];
		int minProd = products[0];
		for (int i = 0; i < products.length; i++) {
			total += products[i];

			if (products[i] > maxProd) {
				maxProd = products[i];
			}
			if (products[i] < minProd) {
				minProd = products[i];
			}

		}

		System.out.println("Total Bill:" + total);
		System.out.println("Higest Price Product:" + maxProd);
		System.out.println("Lowest Price Product:" + minProd);
		System.out.println("Products costing more than 500:");
		for (int i = 0; i < products.length; i++) {
			if (products[i] > 500) {
				System.out.println(products[i]);
			}
		}

	}

}
