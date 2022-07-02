package com.rk;

public class StringExperiment {
	public static void main(String[] args) {
		
		String str = new String("Test");
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		//System.out.println(str.charAt(4));
		
		String biggerString = "This is a lot of Text";
		System.out.println(biggerString.substring(5));
		System.out.println(biggerString.substring(5,10));
		
	}
}
