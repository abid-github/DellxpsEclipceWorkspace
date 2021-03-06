package com.algo.ds;

import java.util.HashSet;

public class SubArrayLongestConsecutive {
	// Returns length of the longest consecutive subsequence
	static int findLongestConseqSubseq(int arr[], int n) {
		HashSet<Integer> S = new HashSet<Integer>();
		int longestStreak = 0;

		// Hash all the array elements
		for (int i = 0; i < n; ++i)
			S.add(arr[i]);

		// check each possible sequence from the start
		// then update optimal length
		/*
		 * for (int i = 0; i < n; ++i) { // if current element is the starting //
		 * element of a sequence if (!S.contains(arr[i] - 1)) { // Then check for next
		 * elements // in the sequence int currentNum = arr[i]; int currentSteak = 1;
		 * 
		 * while (S.contains(currentNum + 1)) { currentNum++; currentSteak++;
		 * 
		 * }
		 * 
		 * longestStreak = Math.max(longestStreak, currentSteak); } }
		 */

		for (int el : arr)

		{
			if (!S.contains(el - 1)) {
				// int currnum = el;
				int currstreak = 1;
				while (S.contains(el + 1)) {
					// currnum++;
					el++;
					currstreak++;
				}

				longestStreak = Math.max(currstreak, longestStreak);

			}

		}
		return longestStreak;
	}

	// Driver Code
	public static void main(String args[]) {
		int arr[] = { 1, 9, 3, 10, 4, 4, 20, 2, 2 };
		// int arr[] = { 4, 2, 1, 9, 6, 7 };

		int n = arr.length;
		System.out.println("Length of the Longest consecutive subsequence is " + findLongestConseqSubseq(arr, n));
	}
}