package com.myfirstt;

public class methodexample {
	
	static {
		methodexample m2=new methodexample();
		m2.method10();
		m2.method2();
		m2.method4();
		m2.method6();
		m2.method8();
		method1();
		
		
	}
	
	static void method1() {
		
		System.out.println("method 1 called");
	}
	
	public void method2(){
		method3();
		System.out.println("method 2 called");
		
	}
	static void method3() {
	
		System.out.println("method 3 called");
	}
	public void method4(){
		method5();
		System.out.println("method 4 called");
		
	}
	static void method5() {
		
		System.out.println("method 5 called");
	}
	public void method6(){
		method7();
		System.out.println("method 6 called");
		
	}
	static void method7() {
		
		System.out.println("method 7 called");
	}
	public void method8(){
		method9();
		System.out.println("method 8 called");
		
	}
	static void method9() {
		
		System.out.println("method 9 called");
	}
	public void method10(){
		
		System.out.println("method 10 called");
		
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		System.out.println("Main method ended");

	}

}
