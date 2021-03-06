package com.algo.ds;

public class ZMArrayBinarySearch {

	static boolean searchmatrix(int matrix[][], int target)

	{

		int rows = matrix.length;
		int columns = matrix[0].length;

		int lw = 0;
		int hr = columns * rows - 1;

		while (lw <= hr) {

			int mid = lw + (hr - lw) / 2;

			int midelement = matrix[mid / columns][mid % columns];

			if (midelement == target) {
				return true;
			}

			else if (midelement > target) {
				hr = mid - 1;
			} else {
				lw = mid + 1;
			}

		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = { { 3, 5, 11 }, { 12, 25, 26 }, { 34, 41, 55 } };

		System.out.println(searchmatrix(m, 25));

	}

}
