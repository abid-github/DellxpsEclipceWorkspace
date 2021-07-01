package com.number;

public class PrimeNumber1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
		//0 and 1 are not prime number , and 2 is only even prime number.

		int max = 100;
		
		System.out.println("Prime numbers between 1 and " + max);

		for (int i = 2; i <= max; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");

			}

		}

	}

}
