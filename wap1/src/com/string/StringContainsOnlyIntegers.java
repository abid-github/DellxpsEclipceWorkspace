package com.string;

public class StringContainsOnlyIntegers {

	public static void main(String[] args) {

		String str = "786786";
		int i = 0;

		while (i < str.length()) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				i++;
			}

			else {
				System.out.println("not integer");
				System.exit(0);
			}
		}

		System.out.println("all integer");

	}

}