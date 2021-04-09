package com.string;

public class EqualsMethodForStringAndSB {

	// StringBuffer doesn't override equals();
	// its equals() method is the one inherited from java.lang.Object, which returns
	// true if and only if "==" would be true.
	// String, on the other hand, does override equals(); its definition returns
	// true of the two objects contain the same sequence of characters.

	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = new String("Hello");

		//System.out.println(s2);

		//System.out.println(s2.toString());

		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");

		System.out.println(sb1 == sb2);//false
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(sb1.equals(sb2));//false 

	}

}
