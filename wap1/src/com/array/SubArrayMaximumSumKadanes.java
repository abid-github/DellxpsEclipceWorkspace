package com.array;

public class SubArrayMaximumSumKadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 4, -5, -6, 10, 15, 1, -2 };

		int max_so_far = Integer.MIN_VALUE;

		int max_ending_here = 0;
		int start = 0, end = 0, temp = 0;

		for (int i = 0; i < a.length; i++) {
			max_ending_here = max_ending_here + a[i];

			if (max_ending_here > max_so_far)

			{
				max_so_far = max_ending_here;
				start = temp;
				end = i;
			}

			if (max_ending_here < 0) {

				max_ending_here = 0;
				temp = i + 1;

			}

		}

		System.out.println("Maximum sum of subarray is = " + max_so_far);
		System.out.println("Between index->" + start + " to index->" + end + " is subarray");
//return max_so_far;
	}

}
