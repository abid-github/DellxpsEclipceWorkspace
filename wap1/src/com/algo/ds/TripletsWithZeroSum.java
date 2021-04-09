package com.algo.ds;

public class TripletsWithZeroSum {

	static void findTriplets(int[] a, int n) {

		boolean found = false;

		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				for (int k = j + 1; k < a.length; k++) {

					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + "," + a[j] + "," + a[k]);
						found = true;
					}

				}
			}
		}

		if (found == false)

		{
			System.out.println("NOt exist");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 0, -1, -2, 3, 4 };
		int n = arr.length;
		findTriplets(arr, n);

	}

}
