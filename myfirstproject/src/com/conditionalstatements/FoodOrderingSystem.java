package com.conditionalstatements;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= MENU =========");
		System.out.println("1. Pizza");
		System.out.println("2. Burger");
		System.out.println("3. Biryani");
		System.out.println("4. Noodles");
		System.out.println("Choose yor food:");
		String s = sc.next();
		switch (s) {
		case "pizza" -> {
			int q=0;
			System.out.println("Enter How Many Pizza you want..");
			q=sc.nextInt();
			System.out.println("Pizza ");

		}
		case "burger" -> {

		}
		case "biryani" -> {

		}
		case "noodles" -> {

		}
		default->System.out.println("Not Available");
		}
	}

}
