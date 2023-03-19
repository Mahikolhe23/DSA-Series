package array;

import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&difficulty[]=0&sortBy=submissions
public class ParanthesisChecker {

	public static void main(String[] args) {
		String par = "{([])}";
//		Character.isAlphabetic(codePoint)
		System.out.println(ispar(par));
	}

	static boolean ispar(String x) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '[') {
				stack.push(x.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if ((stack.peek() == '(' && x.charAt(i) == ')') || (stack.peek() == '{' && x.charAt(i) == '}')
						|| (stack.peek() == '[' && x.charAt(i) == ']')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
