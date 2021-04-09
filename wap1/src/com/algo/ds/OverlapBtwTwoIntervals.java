package com.algo.ds;



public class OverlapBtwTwoIntervals {

	static public void overlap(int[] i1, int[] i2) {
		// Make sure the start time of first interval < the start time of second
		// interval.

		int l = i1[0];
		int r = i1[1];

		if (i2[0] > r || i2[1] < l) {
			System.out.println(-1);
			
		}

		// Else update the intersection
		else {
			l = Math.max(l, i2[0]);
			r = Math.min(r, i2[1]);
		}

		System.out.println("[" + l + ", " + r + "]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] interval1 = { 5, 9 };

		int[] interval2 = { 2, 15 };
		overlap(interval1,interval2);

	}

}
