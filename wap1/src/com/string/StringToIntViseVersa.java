package com.string;

public class StringToIntViseVersa {

	public static void main(String[] args) {
		// ***********Convert String to int**************

		// by Integer.parseInt()

		String num = "109";

		int result = Integer.parseInt(num); //imp

		System.out.println(result);

		// Integer.valueOf()

		int result1 = Integer.valueOf(num);
		System.out.println(result1);

		// *********** Convert int to String*************

		// String.valueOf()

		int i = 10;
		String s = String.valueOf(10);
		System.out.println(s + i);
		System.out.println(s + 10);
		System.out.println(100 + i);

		// Integer.toString()

		String s1 = Integer.toString(i);

		System.out.println(s1 + i);

	}

}
