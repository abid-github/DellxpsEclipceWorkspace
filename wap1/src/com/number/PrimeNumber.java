package com.number;

public class PrimeNumber {

	public static void main(String[] args)

	{
		int n = 18;

		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else
		{

			boolean isPrime = true;

			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {

				System.out.println(n + " Number is prime");

			} else {

				System.out.println(n + " Number is not prime");
			}
		}
	}
}
