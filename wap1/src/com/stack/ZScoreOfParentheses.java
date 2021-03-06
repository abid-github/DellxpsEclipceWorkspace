package com.stack;

import java.util.Stack;

public class ZScoreOfParentheses {

	static int score(String s) {
		int sc = 0;
		Stack<Integer> st = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				st.push(sc);
				sc = 0;
			} else {
				sc = st.pop() + Math.max(sc * 2, 1);
			}
		}
		return sc;
	}

	public static void main(String[] args) {
		// s= ((()()))= 2* 2* (1+1) = 8
		//(())

		String s = "((()()))";

		System.out.println(score(s));

	}

}
