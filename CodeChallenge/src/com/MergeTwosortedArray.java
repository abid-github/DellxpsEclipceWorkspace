package com;

import java.util.Arrays;

public class MergeTwosortedArray {

	public static int[] Merge(int[] arr1, int[] arr2) {

		// int[] arr1 = { 1, 5, 6, 7, 12 };
		// int[] arr2 = { 2, 5, 8, 9, 11, 13 };

		int len1 = arr1.length;
		int len2 = arr2.length;

		int[] res = new int[len1 + len2];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < len1 && j < len2) {
			if (arr1[i] < arr2[j])
				res[k++] = arr1[i++];

			else
				res[k++] = arr2[j++];

		}

		while (i < len1)
			res[k++] = arr1[i++];
		while (j < len2)
			res[k++] = arr2[j++];

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 5, 6, 7, 12 };
		int[] arr2 = { 2, 5, 8, 9, 11 };

		System.out.println(Arrays.toString(Merge(arr1, arr2)));

	}

}
