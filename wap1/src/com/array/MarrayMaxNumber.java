package com.array;

public class MarrayMaxNumber {

	public static void main(String[] args) {

		int m[][] = { { 1, 2, 3 }, { 45, 29 }, { 1, 4, 1, 1 } };

		int max = m[0][0];

		System.out.println(m.length);
		/*
		 * System.out.println(m[0].length); System.out.println(m[1].length);
		 * System.out.println(m[2].length);
		 */

		/*
		 * for (int i = 0; i < m.length; i++) {
		 * 
		 * for (int j = 0; j < m[i].length; j++)
		 * 
		 * { if (m[i][j] > max) max = m[i][j]; }
		 * 
		 * }
		 */

		for (int[] arr : m) {
			for (int data : arr) {
				if (data > max) {
					max = data;
				}
			}

		}

		System.out.println(max);

	}

}
