package com.algo.ds;


public class RotateImage {
	
	//https://www.youtube.com/watch?v=IdZlsG6P17w

	static void print(int[][] matrix) {
		for (int[] data1 : matrix)

		{
			System.out.print("{");

			for (int data : data1) {
				System.out.print(data);

			}
			System.out.print("} ");
			System.out.print("\n");
		}

	}

	static int[][] rotate(int[][] matrix) {
		int n = matrix.length;

		// Transpose Matrix

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {

				int temp = matrix[i][j];

				matrix[i][j] = matrix[j][i];

				matrix[j][i] = temp;
			}
		}

		// Flip Horizontally
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {

				int temp = matrix[i][j];

				matrix[i][j] = matrix[i][n - 1 - j];

				matrix[i][n - 1 - j] = temp;
			}
		}

		return matrix;
	}

	public static void main(String[] args) {

		// int [][] matrix = new int [3][3];

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// int[][] matrix1 = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };

		RotateImage.print(matrix);
		System.out.println(" ----");

		RotateImage.print(RotateImage.rotate(matrix));

	}

}
