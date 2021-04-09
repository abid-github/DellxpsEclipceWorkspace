package com.array;
import java.util.HashSet;

public class SubArraysLongestConsecutive {

	public static void main(String[] args) {

		int[] arr = { 10, 11,12,12, 1, 10, 4 };
		int n = arr.length;

		System.out.println(findLongestConseqSubseq(arr, n));

	}

	static int findLongestConseqSubseq(int[] arr, int n) {
		int ans = 0;

		HashSet<Integer> hst = new HashSet<>();

		for (int data : arr) {
			hst.add(data);
		}

		for (int i = 0; i < n; i++)

		{
			if (!hst.contains(arr[i] - 1)) {
				int temp = arr[i];

				while (hst.contains(temp)) {

					temp++;
				}

				if (ans < temp - arr[i]) {
					ans = temp - arr[i];
				}

				// ans = Math.max(ans, temp - arr[i]);
			}

		}
		return ans;

	}

}
