package com.string;

public class EqualsVsDoubleEqualOperator {

	/*
	 * It must be noted that .equals() method is defined in Object class and is
	 * overridden for content comparison String,collection and all wrapper classes.
	 * 
	 * If a class does not override the equals method, then by default it uses
	 * equals(Object o) method of the closest parent class that has overridden this
	 * method.
	 * 
	 * But equalsIgnoreCase() is defined in String class itself.
	 */

	public static void main(String[] args) {

		String s1 = "lord";
		String s2 = "lord";
		String s5 = "Lord";
		String s6 = "Hello";

		String s3 = new String("lord");
		String s4 = new String("lord");
		
	

		System.out.println(s1 == s2); // true
		System.out.println(s3 == s4); // false

		System.out.println(s1.equals(s2)); // true
		System.out.println(s3.equals(s4)); // true

		s2 = "world";
		System.out.println(s1 == s2); // false

		System.out.println(s1.equals(s5)); // false
		System.out.println(s1 == s5);// false

		System.out.println(s1.equalsIgnoreCase(s5)); // true
		System.out.println(s1.equalsIgnoreCase(s6));// false
		System.out.println(s1.length()); // 4

	}

}