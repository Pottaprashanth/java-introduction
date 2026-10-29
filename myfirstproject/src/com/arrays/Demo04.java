package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int n=sc.nextInt();
        String[] str=new String[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++) {
        	str[i]=sc.next();
          
        }
        
        for(int i=0;i<str.length;i++) {
        	 System.out.println(str[i]);
        }
        
        System.out.println(Arrays.toString(str));
	}
}
