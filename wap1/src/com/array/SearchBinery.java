package com.array;

/**
 * Time Complexity - worst case - O(log n)
 * 
 * @author abids
 *
 */

public class SearchBinery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 5, 8, 20, 25, 30, 50 };

		int srch = 8;
		int l = 0;
		int h = a.length - 1;

		while (l <= h) {

			int mi = l + (h - l) / 2;

			if (a[mi] == srch) {
				System.out.println("Element present at " + mi + " index position");
				break;
			}

			else if (a[mi] < srch) {
				l = mi + 1;
			}

			else {
				h = mi - 1;
			}

		}

		if (l > h) {
			System.out.println("element not avilable ");

		}
	}

}
