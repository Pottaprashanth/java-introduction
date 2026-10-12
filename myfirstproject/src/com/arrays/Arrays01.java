package com.arrays;

public class Arrays01 {

	public static void main(String[] args) {
		System.out.println("Byte Datatype");
		byte[] b=new byte[2];
		b[0]=127;
		b[1]=14;
//		b[2]=23;  Index 2 out of bounds for length 2 at com.arrays.Arrays01.main(Arrays01.java:10)
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	
		System.out.println("short Datatype");
		short[] sho;
		sho = new short[3];
		sho[0] = 10000;
		sho[1] = 200;
		sho[2] = 3000;

		for (int i = 0; i < sho.length; i++) {
			System.out.println(sho[i]);
		}
		
		System.out.println("Int Datatype");
		int[] a;
		a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 40;
		a[3] = 50;
		a[4] = 70;

//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
//	}

		for (int aa : a) {
			System.out.println(aa);

		}

		System.out.println("Long Datatype");
		long[] l;
		l = new long[3];
		l[0] = 123456677;
		l[1] = 123454;
		l[2] = 2345243;

		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}

		System.out.println("Float Datatype");

		float[] f = new float[3];
		f[0] = 10.0f;
		f[1] = 20.99f;
		f[2] = 56.9f;

		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		System.out.println("Double Datatype");

		double[] d = new double[3];
		d[0] = 100.0;
		d[1] = 20.99;
		d[2] = 56.9;

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		System.out.println("char Datatype");
		char[] c=new char[2];
		c[0]='A';
		c[1]='B';
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("Boolean Datatype");
		boolean[] bo=new boolean[4];
		bo[0]=true;
		bo[1]=false;
		bo[2]=true;
		bo[3]=false;
		
		for(int i=0;i<bo.length;i++) {
			System.out.println(bo[i]);
		}
	}

}
