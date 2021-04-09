package com.string;

public class OnlyDigitAndUnicode {

	public static void main(String[] args) {

		System.out.println(isNumeric(" abc")); // false
		System.out.println(isNumeric(""));// false
		System.out.println(isNumeric(" "));// false
		System.out.println(isNumeric("1234"));// true
		System.out.println(isNumeric(" 123.67"));// false
		System.out.println(isNumeric(" abc123"));// false
		System.out.println(isNumeric("0"));// true
		System.out.println(isNumeric(""));// false
		System.out.println(isNumeric(null));// false
		System.out.println("-------------------------------------");
		System.out.println(isEmpty("")); // true
		System.out.println(isEmpty(null));// true
		System.out.println(isEmpty("9"));// false
		System.out.println(isEmpty("abc"));// false

	}

	public static boolean isEmpty(CharSequence cs) {

		return (cs == null || cs.length() == 0);

	}

	public static boolean isNumeric(CharSequence cs)

	{
		if (isEmpty(cs)) {
			return false;
		}

		for (int i = 0; i < cs.length(); i++) {
			if (!Character.isDigit(cs.charAt(i)))

			{
				return false;
			}
		}
		return true;

	}
}
