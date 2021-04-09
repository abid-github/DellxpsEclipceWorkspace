package com.algo.ds;

public class SubArrayMaximumSumKadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 4, -5, -6, 10, 15, 1, -2 };

		int maxsum_sofar = Integer.MIN_VALUE;

		int maxsum_ending = 0;
		// int start = 0, end = 0, temp = 0;

		for (int i = 0; i < a.length; i++) {

			maxsum_ending = maxsum_ending + a[i];

			if (maxsum_ending > maxsum_sofar)

			{
				maxsum_sofar = maxsum_ending;
				// start = temp;
				// end = i;
			}

			if (maxsum_ending < 0) {

				maxsum_ending = 0;
				// temp = i + 1;

			}

		}

		System.out.println("Maximum sum of subarray is = " + maxsum_sofar);
		// System.out.println("Between index->" + start + " to index->" + end + " is
		// subarray");
//return maxsum_sofar;
	}

}
