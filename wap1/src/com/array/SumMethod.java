package com.array;

public class SumMethod {

	static int[] abc;

	// = new int[3];

	static void SUM(int[] abc) {

		int sum = 0;
		for (int i = 0; i < abc.length; i++)

		{
			sum = abc[i] + sum;

		}
		
     System.out.println("Sum of the given array from calling method " + sum);

	}

}
