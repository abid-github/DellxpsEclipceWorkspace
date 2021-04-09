package com.number;

public class FIZZ {

	/**
	 * 
	 * Given a number n, for each integer i in the range from 1 to n inclusive,
	 * print one value per line as follows:
	 * 
	 * If i is a multiple of both 3 and 5, print FizzBuzz. If i is a multiple of 3
	 * (but not 5), print Fizz. If i is a multiple of 5 (but not 3), print Buzz. If
	 * i is not a multiple of 3 or 5, print the value of i.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fizzBuzz(10);

	}

	public static void fizzBuzz(int n) {
		// Write your code here

		for (int i = 1; i <= n; i++)

		{

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			}

			else if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");

			}

			else if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("Buzz");
			}

			else

				System.out.println(i);
		}

	}
}
