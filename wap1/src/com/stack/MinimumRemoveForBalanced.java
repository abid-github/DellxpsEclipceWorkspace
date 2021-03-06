package com.stack;

public class MinimumRemoveForBalanced {

	static public String removeInvalidParentheses(String str) {

		StringBuilder sb = new StringBuilder();
		int open = 0;
		char[] carr = str.toCharArray();

		for (char c : carr) {

			if (c == '(') {
				open++;
			} else if (c == ')') {

				if (open == 0)
					continue;
				open--;
			}

			sb.append(c);

		}

		// return sb.toString();

		StringBuilder res = new StringBuilder();

		for (int i = sb.length() - 1; i >= 0; i--)

		{
			if (sb.charAt(i) == '(' && open-- > 0)
				continue;
			res.append(sb.charAt(i));
		}

		return res.reverse().toString();

	}

	public static void main(String[] args) {

		String s = "l)(e)t)(e ";

	

		System.out.println(removeInvalidParentheses(s));

	}

}
