package com.string;

public class ImpCharactersCountWordwise {

	public static void main(String[] args) {
		String s = "I Love You";

		char[] sa = s.toCharArray();

		int n = sa.length;

		for (int i = 0; i < n; i++) {

			String temp = "";

			while (i < n && sa[i] != ' ') {
				
				temp = temp + sa[i];

				i++;
			}

			System.out.println("Count of char in word--" + temp + "--" + temp.length());

		}

	}

}
