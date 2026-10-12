package com.arrays;

public class Arrays02 {

	public static void main(String[] args) {
		System.out.println("String obj");
		String[] str = new String[3];
		str[0] = "Prashanth";
		str[1] = "Tharun";
		str[2] = "Venkat";

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("Array obj");
		int[] arr=new int[3];
		arr[0]=1;
		arr[1]=9;
		arr[2]=10;
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		

	}

}
