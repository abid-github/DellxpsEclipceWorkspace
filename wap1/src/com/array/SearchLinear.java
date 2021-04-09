package com.array;

/**
 * Time Complexity - worst case - O(n)
 * @author abids
 *
 */

public class SearchLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 5, 3, 2, 1 };

		int targetElement = 2;
		int flag = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == targetElement) {
				targetElement = a[i];
				int pos = i + 1;
				flag++;
				System.out.println(targetElement + " At Position " + pos);
				break;
			}

		}
		if (flag == 0)
			System.out.println("Target NOT present ");
	}

}
