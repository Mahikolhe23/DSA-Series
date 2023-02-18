package linklist;

import java.util.Stack;

public class InfixtoPostfix {

	public static void main(String[] args) {
		String infix = "A+B*(C+D/E*F)+G-H";
		System.out.println(toPostFix(infix));
	}

	public static String toPostFix(String infix) {
		Stack<Character> stack = new Stack<>();
		String postfix = "";
		char c;
		for (int i = 0; i < infix.length(); i++) {
			c = infix.charAt(i);
			// if char at each index is operand then add to it in string
			if (Character.isLetter(c)) {
				postfix = postfix + c;
			} // if it is opening braces
			else if (c == '(') {
				stack.push(c);
			} // if it is closing then pop from the stack till operning bracket
			else if (c == ')') {
				while (stack.peek() != '(') {
					postfix = postfix + stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && !(stack.peek() == '(') && prec(c) <= prec(stack.peek()))
					postfix = postfix + stack.pop();
				stack.push(c);
			}
		}
		while (!stack.isEmpty())
			postfix = postfix + stack.pop();
		return postfix;
	}

	static int prec(char c) {
		if (c == '+' || c == '-')
			return 1;
		if (c == '*' || c == '/')
			return 2;
		return 0;
	}
}
