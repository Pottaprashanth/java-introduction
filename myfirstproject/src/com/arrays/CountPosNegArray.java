package com.arrays;

public class CountPosNegArray {

	public static void main(String[] args) {
		int pos=0;
		int neg=0;
		int zero=0;
		int[] a = {10, -5, 0, 20, -15, 0, 30, -2};
		for(int i=0;i<a.length;i++) {
		if(a[i]>0) {
			pos++;
		}else if(a[i]<0) {
			neg++;
		}
		else {
			zero++;
		}
		}
		System.out.println("Positive numbers ="+pos);
		System.out.println("Negative numbers ="+neg);
		System.out.println("Zero numbers ="+zero);
		System.out.println(pos+neg+zero);
		System.out.println(a.length);
	}

}
