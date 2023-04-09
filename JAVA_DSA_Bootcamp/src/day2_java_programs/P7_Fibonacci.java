package day2_java_programs;

import java.util.Scanner;

public class P7_Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		fibpnacci(6, 3, 5);
		System.out.println("Enter the number ");
		int n = in.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.print(fib(i) + " ");
		}
		in.close();
	}

	public static void fibpnacci(int num, int first, int second) {
		int a = first;
		int b = second;
		System.out.print(a + " " + b + " ");
		for (int i = 1; i < num; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	public static int fib(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
