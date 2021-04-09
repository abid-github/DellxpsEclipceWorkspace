package com.array;

import java.util.Arrays;

public class ArrayPrint {

	/**
	 *
	 * int intArray[]; //declaring array 
	 * intArray = new int[20]; // allocating memory to array 
	 * OR
	 * int[] intArray = new int[20]; // combining both statements in one
	 */
	public static void main(String[] args) {

		int a[] = new int[4];

		a[0] = 1;
		a[1] = 3;
		a[2] = 0;
		a[3] = 1;

		int[] b = { 2, 3, 6, 0 }; // -recommended
		char c[] = { 'a', 'b', 'c' };

		String str[] = { "abid", "myra" };

		/**
		 * object class toString , getClass().getName() + '@' +
		 * Integer.toHexString(hashCode())
		 */

		System.out.println(a);
		System.out.println(c); // Exceptional
		System.out.println(c.toString());
		System.out.println(str);

		/**
		 * PrintStream (which is the type of the System.out instance) has a special
		 * version of println for character arrays - public void println(char x[]) - so
		 * it doesn't have to call toString for that array. It eventually calls public
		 * void write(char cbuf[], int off, int len), which writes the characters of the
		 * array to the output stream.
		 * 
		 */

		System.out.println("for each loop");
		for (int a1 : a)
			System.out.println(a1);
		
		for (char a1 : c)
			System.out.println(a1);


		System.out.println("for loop");

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("Arrays class");

		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		
		System.out.println("\n" + Arrays.toString(a));

		// int [][] twodem = new int[2][3];

		int twodem[][] = { { 1, 10, 3 }, { 4, 5, 6 } };

		System.out.println(twodem[1][2]);
		System.out.println(twodem.length);

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j <= 2; j++)

			{

				System.out.print(twodem[i][j]);
			}

		}
	}

}
