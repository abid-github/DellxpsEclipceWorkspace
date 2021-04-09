package com.stack;

import java.util.Stack;

public class BalancedParenthisisCheck {
	public static String checkBalance(String str) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);

			} else if ((ch == ']' || ch == '}' || ch == ')') && (!stack.isEmpty())) {

				if ((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}')
						|| (stack.peek() == '[' && ch == ']')) {

					stack.pop();

				} else {

					return "Not Balanced1";
				}
			} else {
				// if ((ch == ']' || ch == '}' || ch == ')')) {
				return "Not Balanced2";
				// }
			}
		}
		if (stack.isEmpty())
			return "Balanced Parenthisis";
		else
			return "Not Balanced3";
	}

	public static void main(String[] args) {
		String str = "({})[";

		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		System.out.println(BalancedParenthisisCheck.checkBalance(str));
	}
}