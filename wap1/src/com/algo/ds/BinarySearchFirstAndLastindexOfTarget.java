package com.algo.ds;

import java.util.Arrays;

//Given sorted Array

public class BinarySearchFirstAndLastindexOfTarget {

	public int[] searchrange(int[] nums, int target) {
		
		int[] result = new int[2];

		result[0] = startingindex(nums, target);
		result[1] = endingindex(nums, target);

		return result;

	}

	public int startingindex(int[] nums, int target) {

		int index = -1;
		int low = 0;
		int hi = nums.length - 1;

		while (low <= hi) {
			int m = low + (hi - low) / 2;

			if (nums[m] >= target) {
				hi = m - 1;

			} else {
				low = m + 1;
			}

			if (nums[m] == target)

			{
				index = m;

			}

		}

		return index;

	}

	public int endingindex(int[] nums, int target) {

		int index = -1;
		int low = 0;
		int hi = nums.length - 1;

		while (low <= hi) {
			int m = low + (hi - low) / 2;

			if (nums[m] <= target) {
				low = m + 1;

			} else {
				hi = m - 1;
			}

			if (nums[m] == target) {
				index = m;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchFirstAndLastindexOfTarget ob = new BinarySearchFirstAndLastindexOfTarget();
		int[] arr = { 5, 7, 8, 8, 8, 10, 15, };
		int a = 8;

		int[] resultprint = ob.searchrange(arr, a);

		System.out.println(Arrays.toString(resultprint));

	}

}
