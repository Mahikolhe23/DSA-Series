package day2_java_programs;

import java.util.Scanner;

public class P4_Calculations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = in.nextInt();
		System.out.println("Enter the second number");
		int n2 = in.nextInt();
		System.out.println("Enter the operation ");
		char c = in.next().charAt(0);
		System.out.println(calculate(n1, n2, c));
		in.close();
	}

	public static int calculate(int n1, int n2, char c) {
		if (c == '+') {
			return n1 + n2;
		} else if (c == '-') {
			return n1 - n2;
		} else if (c == '*') {
			return n1 * n2;
		} else if (c == '/') {
			return n1 / n2;
		} else {
			System.out.println("Invalid Operation");
			return -1;
		}
	}
}
