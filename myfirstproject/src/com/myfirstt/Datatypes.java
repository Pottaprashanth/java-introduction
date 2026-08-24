package com.myfirstt;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Datatypes {

	public static void main(String[] args) {
	BigInteger b1=new BigInteger("1012893773678387283783");
	BigInteger b2=new BigInteger("10108923763839378378689");
	BigInteger add=b1.add(b2);
	System.out.println("First Number :"+b1);
	System.out.println("Second Number :"+b2);
	System.out.println("Addition :"+add);
	System.out.println();
    BigDecimal d1=new BigDecimal("1209.5");
    BigDecimal d2=new BigDecimal("1678.9");
    BigDecimal add1=d1.add(d2);
    System.out.println("First Number :"+d1);
	System.out.println("Second Number :"+d2);
	System.out.println("Addition :"+add1);
	}

}
