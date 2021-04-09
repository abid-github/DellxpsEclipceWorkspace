package com.array;

public class ZAppearOnceBitwise {

	public static void main(String[] args) {

		// any one element appear once , and rest are two times .

		int[] a = { 2, 3, 5, 6, 5, 3, 6, 2, 1 };
		int res = a[0];

		for (int i = 1; i <= a.length - 1; i++)

		{
			res = res ^ a[i]; // xor -bitwise operator
		}

		System.out.println(res);

	}

}
