package com.algo.ds;

import java.util.Arrays;

public class OverlapAllIntervals {

	static int[] Intersection(int[][] A) {

		int n = A.length;

		int[] a = new int[2];

		for (int i = 0; i < n; i++) {

			int left = A[0][0];
			int right = A[0][1];

			if (A[i][1] < left || A[i][0] > right) {
				a[0] = -1;
				a[1] = -1;
				return a;
			}

			else

			left = Math.max(left, A[i][0]);
			right = Math.min(right, A[i][1]);
			a[0] = left;
			a[1] = right;

		}
		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = { { 1, 6 }, { 2, 8 }, { 3, 10 }, { 5, 8 }, { 15, 18 } };

		System.out.println(Arrays.toString(Intersection(A)));

	}

}
