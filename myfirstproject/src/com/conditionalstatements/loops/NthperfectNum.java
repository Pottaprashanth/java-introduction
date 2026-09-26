package com.conditionalstatements.loops;

import java.util.Scanner;

public class NthperfectNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
        int n=sc.nextInt(); //1
       
       int result= getNthPer(n);
       System.out.println("Nth perfect number= "+result);
	}

	private static int getNthPer(int n) {
		int count=0;
		for(int i=1;count<n;i++) {  
			if(isPerfect(i)) {
				count++;
				if(count==n) {
					return i;
				}
			}
		}
		
		return -1;
	}

	private static boolean isPerfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) { 
			if(n%i==0) {
				sum+=i;
			}
			 
		}
		return sum==n;
		
	}

}
