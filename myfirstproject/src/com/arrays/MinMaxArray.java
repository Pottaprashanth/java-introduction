package com.arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 34, 5, 6, 2, 62, 99 };

		int min = arr[0];
		int max = arr[0];
		
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}else if(arr[i]>max) {
//				max=arr[i];
//			}
//		}

		for (int a : arr) {
			if (a < min) {
				min = a;
			} else if (a > max) {
				max = a;

			}
		}
		System.out.println("Minimum number in array is:" + min);
		System.out.println("Maximum number in array is:" + max);

	}

}
