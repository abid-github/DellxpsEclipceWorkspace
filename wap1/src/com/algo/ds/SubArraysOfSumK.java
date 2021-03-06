package com.algo.ds;

public class SubArraysOfSumK {
	/*
	 * Returns true if the there is a subarray of arr[] with a sum equal to 'sum'
	 * otherwise returns false. Also, prints the result
	 */
	void subArraySum(int arr[], int n, int K) {

		int flag = 0;

		// Pick a starting point
		for (int i = 0; i < n; i++) {
			int curr_sum = 0;
			// try all subarrays starting with 'i'
			for (int j = i; j < n; j++) {
				curr_sum = curr_sum + arr[j];
				if (curr_sum == K) {
					System.out.println("Sum found between indexes " + i + " and " + j);
					flag++;
				}

				if (curr_sum > K || j == n)
					break;
			}
		}

		System.out.println("total subarrays" + flag);
		if (flag == 0)

			System.out.println("No subarray found");

	}

	public static void main(String[] args) {
		SubArraysOfSumK arraysum = new SubArraysOfSumK();
		int arr[] = { 23, 15, 2, 4, 8, 9, 5, 10 };
		int n = arr.length;
		int sum = 24;
		arraysum.subArraySum(arr, n, sum);
	}
}