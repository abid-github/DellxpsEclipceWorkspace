package com.array;

import java.util.Arrays;

/**
 * Time Complexity - worst O(nlogn) Best-O(nlogn). Like QuickSort, Merge Sort is
 * a Divide and Conquer algorithm. It divides the input array into two halves,
 * calls itself for the two halves, and then merges the two sorted halves. The
 * merge() function is used for merging two halves. The merge(arr, l, m, r) is a
 * key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges
 * the two sorted sub-arrays into one. See the following C implementation for
 * details.
 * 
 * @author abids
 *
 */
public class SortMerge {

	int[] array;
	int[] tempMergeArr;
	int length;

	public void sort(int[] inputArr)

	{
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		divideArray(0, length - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] inputArr = { 48, 36, 13, 52, 19, 94, 21 };
		// int[] inputArr = { 12, 11, 13, 5, 6, 7 };

		// int[] inputArr = { 12, 11, 13, 5, 6, 7 ,94,99,100};
		// int[] inputArr = { 94,95,100,12, 11, 13, 5, 6, 7 };
		int[] inputArr = { 5, 1, 6, 2, 3, 4 };

		SortMerge ms = new SortMerge();
		ms.sort(inputArr);
		System.out.println(Arrays.toString(inputArr));

	}

	public void divideArray(int lw, int hr) {
		if (lw < hr) {

			// Find the middle point
			int md = lw + (hr - lw) / 2;
			divideArray(lw, md);
			divideArray(md + 1, hr);
			mergeArray(lw, md, hr);
		}

	}

	public void mergeArray(int lw, int md, int hr) {

		for (int i = lw; i <= hr; i++) {

			tempMergeArr[i] = array[i];
		}

		int i = lw;
		int j = md + 1;
		int k = lw;

		while (i <= md && j <= hr) {
			if (tempMergeArr[i] <= tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				i++;
			}

			else

			{
				array[k] = tempMergeArr[j];
				j++;
			}

			k++;
		}

		while (i <= md)

		{
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}

		while (j < hr) {

			array[k] = tempMergeArr[j];
			k++;
			i++;
		}

	}

}
