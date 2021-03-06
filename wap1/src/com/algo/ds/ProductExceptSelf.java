package com.algo.ds;

import java.util.Arrays;

public class ProductExceptSelf {

	static int[] product(int[] input) {

		int n = input.length;
		
		int[] output = new int[n];

		int[] left_product = new int[n];
		int[] right_product = new int[n];
		
		left_product[0] = 1;
		right_product[n - 1] = 1;

		for (int i = 1; i < n; i++)

		{
			left_product[i] = input[i - 1] * left_product[i - 1];
		}

		for (int i = n - 2; i >= 0; i--)

		{
			right_product[i] = input[i + 1] * right_product[i + 1];
		}
		
		System.out.println(Arrays.toString(left_product));
		System.out.println(Arrays.toString(right_product));

		for (int i = 0; i < n; i++) {
			output[i] = left_product[i] * right_product[i];
		}

		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 4, 3, 10 };

	
		System.out.println(Arrays.toString(product(a)));

	}

}
