package com.number;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// each number is equal to adding of last two numbers

		int max = 15;
		int n1 = 0;
		int n2 = 1;

		for (int i = 1; i <= max; i++) {

			System.out.print(n1 + " , ");

			// current sum = n1 (2nd last sum) + n2 (most previous sum in process)

			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;

		}

	}

}