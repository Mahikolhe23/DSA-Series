package linklist;

import java.util.Stack;

public class PostfixEvaluation {

	public static void main(String[] args) {
		String s = "100 200 + 2 / 5 * 7 +";
		System.out.println(postfix(s));
	}

	public static int postfix(String postfix) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < postfix.length(); i++) {
			char c = postfix.charAt(i);
			if (c == ' ')
				continue;
			else if (Character.isDigit(c)) {
				int n = 0;
				while (Character.isDigit(c)) {
					n = n * 10 + (int) (c - '0');
					i++;
					c = postfix.charAt(i);
				}
				i--;
				stack.push(n);
			} else {
				int num1 = stack.pop();
				int num2 = stack.pop();
				switch (c) {
				case '+':
					stack.push(num2 + num1);
					break;
				case '-':
					stack.push(num2 - num1);
					break;
				case '*':
					stack.push(num2 * num1);
					break;
				case '/':
					stack.push(num2 / num1);
					break;
				}
			}
		}
		return stack.pop();
	}
}
