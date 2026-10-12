package com.arrays;

public class Sumofarrayelements {

	public static void main(String[] args) {
		int sum = 0;
		int[] n;
		n = new int[4];
		n[0] = 10;
		n[1] = 30;
		n[2] = 20;
		n[3] = 10;

		for (int i = 0; i < n.length; i++) {
			sum += n[i];

		}
		System.out.println("sum of array elements: " + sum);

	}
}
