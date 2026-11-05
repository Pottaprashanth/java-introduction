package com.conditionalstatements.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNum {
public static void main(String[] args) {
int choice=3;
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("Enter a number:");
	int guess=sc.nextInt();
Random r=new Random();
int num=r.nextInt(10);

if(num==guess) {
	System.out.println("Guess Correct");
}
else {
	System.out.println("Guess Incorrect");
}
System.out.println(num);
}while(choice<3);
	choice++;
}
}
