package assignment.list;

import java.util.Stack;

public class InfixToPrefix {

	public static void main(String[] args) {
		String infix = "A+B*(C+D/E*F)+G-H";
		System.out.println(toPrefix(infix));
	}

	static String toPrefix(String infix) {
		String prefix = "";
		Stack<Character> stack = new Stack<Character>();
		char c;
		for (int i = 0; i < infix.length(); i++) {
			c = infix.charAt(i);
			if (Character.isLetter(c)) {
				prefix = c + prefix;
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (stack.peek() == '(') {
					prefix = stack.pop() + prefix;
				}
			} else {
				while (!stack.empty() && !(stack.peek() == '(') && prec(c) <= prec(stack.peek()))
					prefix = stack.pop() + prefix;
				stack.push(c);
			}
		}
		while (!stack.isEmpty())
			prefix = stack.pop() + prefix;
		return prefix;
	}

	private static int prec(char c) {
		if (c == '+' || c == '-')
			return 1;
		if (c == '*' || c == '/')
			return 2;
		return 0;
	}
}
