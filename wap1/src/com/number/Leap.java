package com.number;

public class Leap {

	static int x = 1900;

	public static void main(String[] args) {

		/*
		 * To be a leap year, the year number must be divisible by four – except for
		 * end-of-century years, which must be divisible by 400.
		 */
		// Year should be divided by 4 but not by 100.
		// unless century divisible by 400.

		if (x % 4 == 0) {
			if (x % 100 == 0) {
				if (x % 400 == 0) {
					System.out.println("x is leap year and century");// 2000
				} else
					System.out.println("x is NOT a leap year but century");// 1900
			} else
				System.out.println("x is leap year and not century");// 2004
		} else
			System.out.println("x is NOT a leap and not a centuey year");// 2005

		Leap1.m();
	}
}

class Leap1

{

	/*
	 * Logical operators- The ‘&&’ operator doesn’t evaluate the second operand if
	 * the first operand becomes false. Similarly ‘||’ doesn’t evaluate the second
	 * operand when first operand becomes true. The bitwise ‘&’ and ‘|’ operators
	 * always evaluate their operands.
	 */

	static void m() {
		int y = Leap.x;
		if (y % 400 == 00 || (y % 4 == 0 && y % 100 != 0)) {
			System.out.println("x is LEAP year");
		} else
			System.out.println("x is NOT LEAP year");
	}
}
