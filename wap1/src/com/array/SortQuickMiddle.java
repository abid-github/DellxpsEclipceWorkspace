package com.array;

/**
 * Time Complexity - worst O(n2) , Best and Avg - O(nlogn). Like Merge Sort,
 * QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and
 * partitions the given array around the picked pivot. There are many different
 * versions of quickSort that pick pivot in different ways.
 * 
 * Always pick first element as pivot. 
 * Always pick last element as
 * pivot, Pick a random element as pivot. 
 * Pick median as pivot. 
 * The key process in quickSort is partition(). Target of partitions is,
 * given an array and an element x of array as pivot, put x at its correct
 * position in sorted array and put all smaller elements (smaller than x) before
 * x, and put all greater elements (greater than x) after x. 
 * All this should be done in linear time.
 * 
 * @author abids
 *
 */
import java.util.Arrays;

public class SortQuickMiddle {

	static int partition(int[] arr, int l, int h) {
		int pivot = arr[l + (h - l) / 2];
		while (l <= h) {
			while (arr[l] < pivot) {
				l++;
			}
			while (arr[h] > pivot) {
				h--;
			}
			if (l <= h) {
				int temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
				l++;
				h--;
			}
		}
		return l;    //NOTE
	}

	static void quickSortRecursion(int[] arr, int l, int h) {
		int pi = partition(arr, l, h);
		if (l < pi - 1) {
			quickSortRecursion(arr, l, pi - 1);
		}
		if (pi < h) {
			quickSortRecursion(arr, pi, h);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 5, 3, 10, 15, 2, 20 };
		int leng = a.length;
		quickSortRecursion(a, 0, leng - 1);
		System.out.println(Arrays.toString(a));

	}

}
