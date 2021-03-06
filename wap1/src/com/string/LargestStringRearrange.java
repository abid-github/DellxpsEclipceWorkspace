package com.string;

public class LargestStringRearrange {

	public static void main(String[] args) {

		System.out.println(getLargestString("bbbaab", 2));
		System.out.println(getLargestString("baccc", 2));
		
		

	}

	public static String getLargestString(String s, int k) {

		int[] countArray = new int[26];
		char[] chars = s.toCharArray();

		for (char c : chars) {
			countArray[c - 'a'] = countArray[c - 'a'] + 1;
		}

		String result = "";

		int i = 25;
		while (i >= 0) {

			// chars more than k
			if (countArray[i] >= k) {

				// Add K Characters
				int count = k;
				while (count > 0) {
					result = result.concat(getLetter(i));
					count--;
				}
				countArray[i] -= k;

				// Iterate until you find a character
				int j = i - 1;
				while (countArray[j] <= 0)
					j -= 1;

				// Just add 1 chracter
				if (countArray[j] > 0 && j >= 0) {
					result = result.concat(getLetter(j));
					countArray[j] -= 1;
				}

				else {
					break;
				}
				// chars less than k , simple append
			} else

			if (countArray[i] > 0) {
				int count = countArray[i];
				while (count > 0) {
					result = result.concat(getLetter(i));
					count--;
				}
				countArray[i] = 0;
				// No char here on this index
			} else {
				i -= 1;
			}
		}
		// System.out.println(result);
		return result;
	}

	private static String getLetter(int i) {
		return (char) (i + 'a') + "";
	}

}
