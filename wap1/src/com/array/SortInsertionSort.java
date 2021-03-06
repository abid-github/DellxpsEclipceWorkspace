package com.array;

public class SortInsertionSort {

	/**
	 * Time Complexity - worst O(n2) Best-O(n). 
	 * Insertion sort is a simple sorting
	 * algorithm that works similar to the way you sort playing cards in your hands.
	 * The array is virtually split into a sorted and an unsorted part. Values from
	 * the unsorted part are picked and placed at the correct position in the sorted
	 * part. Algorithm To sort an array of size n in ascending order: 1: Iterate
	 * from arr[1] to arr[n] over the array. 2: Compare the current element (key) to
	 * its predecessor. 3: If the key element is smaller than its predecessor,
	 * compare it to the elements before. Move the greater elements one position up
	 * to make space for the swapped element.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 5, 6, 2, 10, 12 };

		int key, j;

		for (int i = 1; i < a.length; i++) {
			key = a[i];
			j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */

			while (j >= 0 && a[j] > key)

			{
				a[j + 1] = a[j];

				j--;

			}

			a[j + 1] = key;
		}

		for (int data : a) {
			System.out.println(data);
		}

	}

}
