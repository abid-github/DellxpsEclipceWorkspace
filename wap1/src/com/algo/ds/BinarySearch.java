package com.algo.ds;

public class BinarySearch  {
	
	
	


	//Sorted and duplicates not allowed
	// Returns index of x if it is present in arr[],
	// else return -1
	public int binarySearch(int arr[], int target) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == target) {
				return m;
			}

			// If x greater, ignore left half
			else if (arr[m] < target) {
				l = m + 1;
			}

			// If x is smaller, ignore right half
			else {
				r = m - 1;
			}
		}

		// if we reach here, then element was
		// not present
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {

		BinarySearch ob = new BinarySearch();
		int arr[] = { 2,3, 4, 10, 20, 40 };

		int x = 20;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);

	}
}
