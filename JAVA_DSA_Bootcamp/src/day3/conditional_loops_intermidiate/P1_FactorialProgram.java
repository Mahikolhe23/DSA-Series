package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P1_FactorialProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Factorial = " + fact1(5));
		in.close();
	}

	public static int fact(int n) {
		if (n == 1)
			return n;
		return n * fact(n - 1);
	}

	public static int fact1(int n) {
		int sum = 1;
		for (int i = 1; i < n; i++) {
			sum += i * sum;
		}
		return sum;
	}
}
