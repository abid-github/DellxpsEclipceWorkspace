package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesesScanner {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String brackets = sc.nextLine();

		// CREATING THE stack FOR THE BRACKETS
		Stack<Character> stack = new Stack<>();

		// CHECKING WHETHER THE BRACKETS ARE BALANCED
		boolean isBalanced = true;
		// GETTING THROUGH ALL THE ELEMENTS FROM THE INPUT

		for (int i = 0; i < brackets.length(); i++) {
			// GETTING ONE SINGLE BRACKET AND PUTTING IT INTO THE char bracket
			char bracket = brackets.charAt(i);
			// CHECKING WHETHER THE BRACKET TYPE IS THE OPENING ONE
			
			if (bracket == '{' || bracket == '[' || bracket == '(') {
				// ADDING THE OPENING BRACKET INTO THE stack
				stack.push(bracket);
			}
			
			else
			
			{
				if (bracket == '}') {
					bracket = '{';
				}

				else if (bracket == ')') {
					bracket = '(';
				} 
				else if (bracket == ']') {
					bracket = '[';
				}
				
				// CHECKING WHETHER THE stack IS EMPTY
				if (stack.empty()) {
					isBalanced = false;
					break;
				}

				if (bracket == stack.peek()) {
					stack.pop();
				} else {
					isBalanced = false;
					break;
				}
			}
		}

		if (isBalanced) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
