package com.array;

import java.util.Arrays;

public class MarrayPrint {

	public static void main(String[] args) {

		// create a 1st array
		// Print all elements of 2d array
		int[][] a = { { 1, -2, 3 }, { -4, -5, 6, 9 }, { 7,0 }, };

		// System.out.println(a.length);

		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				// System.out.println(a[i][j]);

				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();

		}

		System.out.println("By for each lopp");
		
		// create a 2d array
		int[][] b = { { 1, 0, 3 }, { -4, -5, 9, 1 }, { 100 }, };
		
		
	System.out.println(Arrays.deepToString( b));

		// first for each loop access the individual array inside the 2d array

		for (int[] innerArray1 : b) {
			System.out.print("{");
			// second for each loop access each element inside the row
			for (int data : innerArray1) {

				// System.out.println(data);
				System.out.print(data + " ");

			}
			System.out.print("} ");

			System.out.println();
		}

	}
}
