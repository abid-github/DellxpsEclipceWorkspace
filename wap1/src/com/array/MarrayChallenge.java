package com.array;

public class MarrayChallenge {

	public static void main(String[] args) {
		/**
		 * 1.Find smallest number 
		 * 2.Get the highest number, from column of the minimum number.
		 */

		int[][] a = { { 10, 5, 11 }, { 2, 25, 20 }, { 4, 11, 1 } };
		//int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		int min = a[0][0];
		int cm = 0;
		int hcm = a[0][cm];
		int k = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (min > a[i][j])

				{
					min = a[i][j];
					cm = j;
				}
			}

		}
		while (k < 3) {
			if (hcm < a[k][cm]) {
				hcm = a[k][cm];
			}
			k++;
		}

		System.out.println("minimum Value " + min);
		System.out.println("cloumn of minimum number " + cm);
		System.out.println("maxium value of column of minimum number" + hcm);
	}

}
