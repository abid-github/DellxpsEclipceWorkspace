package com.prac;

import java.util.Arrays;

public class SortedSquaredArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { -1, -5, 2, 3, 7, 9, 10, -6, -8 }; // -8, -6,-5,-1,3,7

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		int n = arr.length;
		int[] res = new int[n];

		int l = 0;
		int h = n - 1;

		for (int i = h; i >= 0; i--) {
			if (Math.abs(arr[l]) > Math.abs(arr[h])) {

				res[i] = (arr[l]) * (arr[l]);
				l++;

			} else {
				res[i] = (arr[h]) * (arr[h]);
				h--;

			}

		}

		System.out.println(Arrays.toString(res));

	}

}
