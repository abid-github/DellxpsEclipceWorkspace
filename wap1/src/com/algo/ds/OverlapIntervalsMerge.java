package com.algo.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlapIntervalsMerge {

	static int[][] merge(int[][] intervals) {

		if (intervals.length <= 1) {

			return intervals;
		}

		// Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

		List<int[]> result = new ArrayList<>();

		int[] currInv = intervals[0];

		result.add(intervals[0]);

		for (int[] interval : intervals)

		{
			int currleft = currInv[0];
			int currright = currInv[1];

			int nextleft = interval[0];
			int nextright = interval[1];

			if (currright >= nextleft) {
				currInv[1] = Math.max(currright, nextright);
			}

			else
				currInv = interval;

			result.add(currInv);

		}

		//new int[result.size()][]
	
		return result.toArray( new int[result.size()][]);

	}

	public static void main(String[] args) {

		// int[][] A = { { 1, 6 }, { 2, 8 }, { 3, 10 }, { 5, 8 }, { 15, 18 } };
		int[][] A = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		System.out.println(Arrays.deepToString(merge(A)));

		/*
		 * for (int[] innerArray1 : merge(A)) { System.out.print("{"); // second for
		 * each loop access each element inside the row for (int data : innerArray1) {
		 * 
		 * // System.out.println(data); System.out.print(data + " ");
		 * 
		 * } System.out.print("} ");
		 * 
		 * System.out.println(); }
		 */
	}
}
