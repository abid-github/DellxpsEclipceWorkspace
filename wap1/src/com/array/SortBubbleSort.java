package com.array;

import java.util.Arrays;

/**
 * Time complexity - worst -O(n2) and best -O(n)
 * 
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements if they are in wrong order.
 * 
 * @author abids
 *
 */

public class SortBubbleSort {

	public static void main(String[] args) {

		// int[] a = { 20, 30, 10, 15, 1 };

		String[] a = { "abid", "iram", "myra", "mysha" };

		// int temp;
		String temp;

		for (int i = 0; i < a.length; i++)

		{

			int flag = 0;

			// -i , ignore end element check in respective pass

			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j].compareTo(a[j + 1]) > 0)

				// (a[j] > a[j + 1])

				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
//useless pass removed 
			if (flag == 0) {
				break;
			}

		}
		

		System.out.println(Arrays.toString(a));

	}

}
