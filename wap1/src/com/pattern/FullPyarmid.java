package com.pattern;

public class FullPyarmid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int trow = 5;

		for (int i = 1; i <= trow; i++)

		{

			for (int space = 1; space <= trow - i; space++) {
				System.out.print("  ");
			}
			int k = 0;
			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}
			System.out.println();
		}

	}

}
