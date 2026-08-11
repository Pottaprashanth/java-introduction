package com.myfirstt;
class A{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("in a class");
	}
	A b;
	
}
class B{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("in b class");
	}
	B a;
}

public class gb {
	@Override
	protected void finalize() {
		System.out.println("tharun removed from garbage");
	}

	public static void main(String[] args) {
		System.out.println("Tharun gb started");
		A a1= new A();
		B b1 = new B();
		
		a1.b=a1;
		b1.a=b1;

	a1=null;
	b1=null;
	
		System.out.println("a and b refernces removed");
		System.gc();
		

	}

}
