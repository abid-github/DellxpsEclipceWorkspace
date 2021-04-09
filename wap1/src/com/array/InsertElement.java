package com.array;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {

		// want to insert 99 at position 3

		int[] a = { 10, 15, 30, 40, 55, 66, 88 };

		int pos = 3;

		// int temp;

		for (int i = a.length - 1; i > pos - 1; i--)

		{

			a[i] = a[i - 1];

		}

		a[pos - 1] = 99;

		System.out.println(Arrays.toString(a));

	}

}
