package com.exceptionhandling;

//ArrayIndexOutOfBoundsException
public class TestUnChException2 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;

		} catch (IndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

		for (int a : arr) {
			System.out.println(a);
		}

	}

}
