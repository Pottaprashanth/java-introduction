package com.arrays;

public class Allpairs {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int t=6;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==t) {
					System.out.println("("+ arr[i] +"," +arr[j]+")");
				}
			}
		}

	}

}
