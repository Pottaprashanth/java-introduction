package com.myfirstt;

//public class Test1 {
//    static int x=10;
//    static {
//    	x=20;
//    	System.out.println(x);
//    }
//	public static void main(String[] args) {
//		
//System.out.println(x);
//	}
//
//}

//public class Test1{
//	static int x= 10;
//	{
//		x=30;
//		System.out.println(x);
//	}
//	{
//		x=20;
//		System.out.println(x);
//	}
//	
//	public static void main(String[] args) {
//		Test1 t1=new Test1();
//		System.out.println("X"+ x);
//	}
//
//	
//}

public class Test1{
	int x=100; 
	static int y= 100;
	
	
	public static void main(String[] args) {
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		t2.x=200; t2.y=200;
		
		System.out.println ("instance data"+t1.x);
		System.out.println ("instance data"+t2.y);
		System.out.println ("static data"+ t1.x);
		System.out.println ("static data"+ t2.y);
	}

	
}



















































































































