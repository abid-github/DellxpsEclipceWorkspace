package com.string;

public class AtoZPangram {

	public static void main(String[] args) {
		String str = "The Quick Brown Fox Jumps Over A Lazy Dog";
		str = str.replace(" ", "");
		str = str.toUpperCase();
		char[] carr = str.toCharArray();
		int[] temp = new int[26];

		for (int i = 0; i < carr.length; i++) {
			//temp[carr[i] - 'A'] = temp[carr[i] - 'A'] + 1;
			
			temp[carr[i] - 'A']++;

		}

		for (int j = 0; j < 26; j++) {
			if (temp[j] >= 1) {
			} else {
				System.out.println("It is not pangram ");
				System.exit(0);
			}
		}
		System.out.println("It is pangarm");

	}

}
