package com.algo.ds;

/*
 * 
 * Imagine you have a special keyboard with the following keys: 
Key 1:  Prints 'A' on screen
Key 2: (Ctrl-A): Select screen
Key 3: (Ctrl-C): Copy selection to buffer
Key 4: (Ctrl-V): Print buffer on screen appending it
                 after what has already been printed. 

If you can only press the keyboard for N times (with the above four
keys), write a program to produce maximum numbers of A's. That is to
say, the input parameter is N (No. of keys that you can press), the 
output is M (No. of As that you can produce).
 */

public class ZMaxAWithSpecialKeyboard {

	static int findoptimal(int n) {
		int res = 0;

		if (n < 7) {
			return n;
		}

		else

			for (int i = n - 3; i > 0; i--) {

				int curr = (n - i - 1) * findoptimal(i);

				if (curr > res)
					res = curr;
			}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int N;

			// for the rest of the array we
			// will rely on the previous
			// entries to compute new ones
			for (N = 1; N <= 20; N++)
				System.out.println("Maximum Number of A's with keystrokes is " + N + "---"+ findoptimal(N));
		}
	}

}
