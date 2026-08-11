package com.myfirstt;

public class methodexample {
	
	static void method1() {
		methodexample m=new methodexample();
		m.method2();
		System.out.println("method 1 called");
	}
	
	public void method2(){
		method3();
		System.out.println("method 2 called");
		
	}
	static void method3() {
		methodexample m2=new methodexample();
		m2.method4();
		System.out.println("method 3 called");
	}
	public void method4(){
		method5();
		System.out.println("method 4 called");
		
	}
	static void method5() {
		methodexample m3=new methodexample();
		m3.method6();
		System.out.println("method 5 called");
	}
	public void method6(){
		method7();
		System.out.println("method 6 called");
		
	}
	static void method7() {
		methodexample m3=new methodexample();
		m3.method8();
		System.out.println("method 7 called");
	}
	public void method8(){
		method9();
		System.out.println("method 8 called");
		
	}
	static void method9() {
		methodexample m3=new methodexample();
		m3.method10();
		System.out.println("method 9 called");
	}
	public void method10(){
		
		System.out.println("method 10 called");
		
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		method1();
		System.out.println("Main method ended");

	}

}
