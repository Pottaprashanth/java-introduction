package com.arrays;

public class SecondLargestArrayEle {

	public static void main(String[] args) {
	
		int[] a = {10, 50, 30, 90, 40, 70};
		int largest=Integer.MIN_VALUE;
		int slargest=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				slargest=largest;
				largest=a[i];
							}else if (a[i] > slargest && a[i] != largest) {

							    slargest = a[i];

							}
			
		}
		System.out.println("Largest element = "+largest);
		System.out.println("Second largest element = "+slargest);
		
	}

}
