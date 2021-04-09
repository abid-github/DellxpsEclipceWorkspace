package com.algo.ds;

import java.util.Arrays;

public class SortedSquaredArray {

	static int[] sortedsqarr(int[] ina) {

		int left = 0;
		int right = ina.length - 1;
		int[] result = new int[ina.length];

		for (int i = right; i >= 0; i--) {
			if (Math.abs(ina[left]) > ina[right]) {
				result[i] = ina[left] * ina[left];
				left++;
			} else {
				result[i] = ina[right] * ina[right];
				right--;
			}
		}

		return result;

	}

	public static void main(String[] args) {

		int[] a = { -5, -3, -1, 2, 3, 4 };
		// SortedSquaredArray.sortedsqarr(a);

		System.out.println(Arrays.toString(SortedSquaredArray.sortedsqarr(a)));

	}

}
