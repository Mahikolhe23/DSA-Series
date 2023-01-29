//package assignment;
//
//import java.util.Stack;
//
//public class PostfixEvaluate {
//
//	public static void main(String[] args) {
//		String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
//		System.out.println(postfix(tokens));
//	}
//
//	public static int postfix(String[] s) {
//		// create stack to push integer form
//		Stack<Integer> postfix = new Stack<Integer>();
//		for (int i = 0; i < s.length; i++) {
//			// check it is operator or operand- if operand cal value
//			if (isOperator(s.charAt(i))) {
//				int o1 = postfix.pop();
//				int o2 = postfix.pop();
//				switch (s.charAt(i)) {
//				case '+':
//					postfix.push(o2 + o1);
//					break;
//				case '-':
//					postfix.push(o2 - o1);
//					break;
//				case '*':
//					postfix.push(o2 * o1);
//					break;
//				case '/':
//					postfix.push(o2 / o1);
//					break;
//				}
//			} else {
//				// convert to integer
//				postfix.push(s.charAt(i) - '0');
//			}
//		}
//		return postfix.pop();
//	}
//
//	public static boolean isOperator(char ch) {
//		if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
//			return true;
//		return false;
//	}
//
//}
