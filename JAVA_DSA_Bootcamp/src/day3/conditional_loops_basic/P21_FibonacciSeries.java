package day3.conditional_loops_basic;

import java.util.Scanner;

public class P21_FibonacciSeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to print fib");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(fib(i) + " ");
		}
		in.close();
	}

	private static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
