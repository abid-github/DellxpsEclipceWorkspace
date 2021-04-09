package com.string;

public class ReverseRecursion {

	public static void main(String[] args) {
		String s = "SANDY";

		System.out.println(recursiveString(s));
	}

	private static String recursiveString(String s)

	{

		// if (s.isEmpty())
		if (s == null || s.length() <= 1) {
			return s;
		}

		return recursiveString(s.substring(1)) + s.charAt(0);

	}

}
