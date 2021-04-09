package com.array;

import java.util.Arrays;

public class Marray3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] scores = new int[5][4][3];

		// Initialization given 3d array

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j< scores[i].length; j++) {
				for (int k = 0; k < scores[i][j].length; k++) {
					scores[i][j][k] = i * 1;
					//scores[i][j][k] = b + 1;
				}
			}
		}
		
		
		System.out.println(Arrays.deepToString(scores));

//printing
		
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print("{");
				for (int k = 0; k < scores[i][j].length; k++) {
					System.out.print(scores[i][j][k] + " ");
				}
				System.out.print("} ");
			}
			System.out.println();
		}
		
		System.out.println(" By for each loop");
		
		for ( int [][]s2 : scores )
		{
			for (int []s1: s2)
			{
				System.out.print("{");
				for(int data : s1)
				{
					System.out.print(data+ " ");
				}
				System.out.print("} ");
			}
			System.out.println();
		}
		
		
	}

}
