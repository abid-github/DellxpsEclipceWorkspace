package com.array;

public class ReturnSum {

	static  int abc[] = { 4, 5, 6 };

	static int SUM() {

		int sum = 0;
		for (int i = 0; i < abc.length; i++)

		{
			sum = abc[i] + sum;

		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println("Sum of the given array " + SUM());

	}

}
