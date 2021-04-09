package com.string;

public class SwapWithoutUsingThird {

	public static void main(String[] args) {
		
		
		String a = "LOVE";
		String b = "YOU";
		
		
		
		int i = a.length();
		
		a= a+b;
		
		System.out.println(a);
		
		b= a.substring(0, i);
		a= a.substring(i);
		
		System.out.println(a);
		System.out.println(b);
		
		

	}

}