package com.algo.ds;

import java.util.HashSet;

//Minimum index of duplicates of second value
//Given array a that contains only numbers in the range from  1 to a.length.
public class FirstDuplicateEarlyOccurance {

	public static void main(String[] args) {

		// int[] arr = { 1,2,3,4,5,6 };
		// int[] arr = { 2, 1, 3, 5, 3, 2 };
		int[] arr = { 2, 1, 4, 3, 4, 5, 3, 2 };

		System.out.println(firstDuplicates(arr));

	}

	static int firstDuplicates(int[] a) {

		/*
		 * int min_sec_index = a.length;
		 * 
		 * for (int i = 0; i < a.length; i++) { for (int j = i + 1; j < a.length; j++) {
		 * 
		 * if (a[i] == a[j]) { min_sec_index = Math.min(min_sec_index, j);
		 * 
		 * } } }
		 * 
		 * if (min_sec_index == a.length)
		 * 
		 * return -1; else return a[min_sec_index];
		 * 
		 * 
		 */

		/*
		 * HashSet<Integer> seen = new HashSet<>();
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * if (seen.contains(a[i])) { return a[i];
		 * 
		 * } else
		 * 
		 * seen.add(a[i]); }
		 * 
		 * return -1;
		 */

		for (int i = 0; i < a.length; i++) {
			if (a[Math.abs(a[i]) - 1] < 0)

			{
				return Math.abs(a[i]);

			}

			else {
				a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
			}
		}

		return -1;
	}

}
