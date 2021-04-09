package com.array;


/**
 * Time Complexity - O(n2) -worst and best both
 * The selection sort algorithm sorts an array by repeatedly 
 * finding the minimum element (considering ascending order) 
 * from unsorted part and putting it at the beginning. 
 * The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element 
(considering ascending order) from the unsorted subarray is picked 
and moved to the sorted subarray.
 */



public class SortSelectionSort {


	public static void main(String[] args) {

		// int[] a = { 15, 16, 30, 10, 0, 4, };

		String[] a = { "abid", "myra", "mysha", "iram" };

		int min;

		// int
		String temp = "";
		// 0;

		for (int i = 0; i < a.length; i++)

		{
			min = i;

			for (int j = i + 1; j < a.length; j++) {

				if (a[min].compareTo(a[j]) > 0)

				// (a[min]>a[j])
				{
					min = j;
				}
			}

			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		// for (int ver:a)
		for (String ver : a)

			System.out.println(ver);
	}

}
