package com.collection.programming;

import java.util.HashSet;

public class FirstDuplicateLateOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2,1,4,3,4,5,3,2 };

//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++)
//
//			{
//				if (a[i] == a[j]) {
//					System.out.println(a[i]);
//					System.exit(0);
//				}
//							}
//
//		}

		int temp = -1;

		HashSet<Integer> hst = new HashSet<Integer>();

		for (int i = a.length - 1; i >= 0; i--) 
			
			// for ( int i =0 ; i<a.length; i++) for last duplicate

		{
			if (hst.contains(a[i])==true ) {
				temp = i;
			}

			else {
				hst.add(a[i]);
			}
		}
		System.out.println(hst);
		if (temp != -1) {
			System.out.println("first Duplicate is " + a[temp]);
		} else

		{
			System.out.println("first Duplicate not found" );

		}

	}

}
