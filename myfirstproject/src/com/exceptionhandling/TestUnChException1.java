package com.exceptionhandling;

public class TestUnChException1 {

	public static void main(String[] args) {
		String s1 = "java";
		System.out.println(s1.length());

		try {
			String s2 = null;
			System.out.println(s2.length()); // NullPointerException
		} catch (Exception e) {
			e.printStackTrace();// Name + Description + Location
			System.err.println(e);// Name + Description
			System.err.println(e.getMessage()); // Description
			System.err.println(e.toString()); // Name + Description
		}

		String s3 = "Prashanth";
		System.out.println(s3.charAt(5));

	}

}
