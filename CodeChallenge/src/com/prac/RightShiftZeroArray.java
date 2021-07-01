package com.prac;

import java.util.Arrays;

public class RightShiftZeroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 0, 20, 0, 30, 10, 0, 15, 0, 1 };
		// int[] res = new int[a.length];
		int count = 0;

		for (int data : a) {
			if (data != 0)

			{
				a[count++] = data;
			}

		}
		while (count < a.length) {
			a[count++] = 0;

		}
		System.out.println(Arrays.toString(a));
	}

}
