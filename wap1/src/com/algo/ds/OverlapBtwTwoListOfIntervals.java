package com.algo.ds;

//https://www.geeksforgeeks.org/find-intersection-of-intervals-given-by-two-lists/

public class OverlapBtwTwoListOfIntervals {

	static void printIntervals(int intervals1[][], int intervals2[][]) {

// i and j pointers for arr1 and  
// arr2 respectively 
		int i = 0, j = 0;

		int n = intervals1.length, m = intervals2.length;

// Loop through all intervals unless   
// one of the interval gets exhausted 
		while (i < n && j < m) {

// Left bound for intersecting segment 
			int l = Math.max(intervals1[i][0], intervals2[j][0]);

// Right bound for intersecting segment 
			int r = Math.min(intervals1[i][1], intervals2[j][1]);

// If segment is valid print it 
			if (l <= r)
				System.out.print("{" + l + ", " + r + "}");

// If i-th interval's right bound is   smaller increment i, else increment j 
			if (intervals1[i][1] < intervals2[j][1])
				i++;

			else

				j++;
		}
	}

	public static void main(String[] args) {
		int arr1[][] = { { 0, 4 }, { 5, 10 }, { 13, 20 }, { 24, 25 } };

		int arr2[][] = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };

		printIntervals(arr1, arr2);

	}

}
