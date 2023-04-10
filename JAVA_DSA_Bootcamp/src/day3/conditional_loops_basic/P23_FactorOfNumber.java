package day3.conditional_loops_basic;

import java.util.Scanner;

public class P23_FactorOfNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = in.nextInt();
		factor(n);
		in.close();
	}

	public static void factor(int n) {
		System.out.println("Factor of Number is ");
		for (int i = 2; i <= n; i++) {
			if (n % i == 0)
				System.out.print(i + " ");
		}
	}
}
