package com.conditionalstatements;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		int c;
		do {
			Scanner sc = new Scanner(System.in);
			int a = 100;
			int b = 20;
			System.out.println("Enter 1 for Addition \n" + "Enter 2 for Subtraction \n"
					+ "Enter 3 for Multiplication \n" + "Enter 4 for Division \n" + "Enter 5 for Modulo \n");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				int result = a + b;
				System.out.println("Addition is:" + result);
				break;
			}
			case 2: {
				int result = a - b;
				System.out.println("Subtraction is:" + result);
				break;
			}
			case 3: {
				int result = a * b;
				System.out.println("Multiplication is:" + result);
				break;
			}
			case 4: {
				int result = a / b;
				System.out.println("Division is:" + result);
				break;
			}
			case 5: {
				int result = a % b;
				System.out.println("Modulo is:" + result);
				break;
			}
			default: {
				System.out.println("Invalid Number");
			}
			}
			System.out.println("Enter number 1 for continue and 0 for exit");
			c = sc.nextInt();
		} while (c == 1);
		System.out.println("you are exited");
	}
}
