package com.leetcode.programs;

import java.util.Stack;

public class ValidParentheses {

	public boolean parenthesesValidation(String s) {

		if (s.length() % 2 != 0) {
			return false;
		}

		Stack<Character> stack = new Stack<Character>();
		boolean result = stack.empty();
		System.out.println("Stack empty - " + result);

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				stack.push('(');
			} else if (s.charAt(i) == '[') {
				stack.push('[');
			} else if (s.charAt(i) == '{') {
				stack.push('{');
			} else if (s.charAt(i) == '<') {
				stack.push('<');
			} else if (stack.isEmpty()) {
				return false;
			} else if (s.charAt(i) == ')' && stack.peek() == '(') {
				stack.pop();
			} else if (s.charAt(i) == ']' && stack.peek() == '[') {
				stack.pop();
			} else if (s.charAt(i) == '}' && stack.peek() == '{') {
				stack.pop();
			} else if (s.charAt(i) == '>' && stack.peek() == '<') {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "([]<>)";
		ValidParentheses objValidParentheses = new ValidParentheses();
		boolean answer = objValidParentheses.parenthesesValidation(s);
		System.out.println("Parentheses Validation - " + answer);
	}
}
/*
 * public class ValidParentheses { public boolean ParenthesesValidation(String
 * s) {
 * 
 * for (int i = 0; i < s.length(); i++) { for (int j = 0; j < s.length() - 1;
 * j++) if (s.charAt(i) == s.charAt(j)) { return true; } } return false; }
 * 
 * public static void main(String[] args) { String s = "(<[}"; ValidParentheses
 * objValidParentheses = new ValidParentheses(); boolean result =
 * objValidParentheses.ParenthesesValidation(s); System.out.println(result); } }
 */