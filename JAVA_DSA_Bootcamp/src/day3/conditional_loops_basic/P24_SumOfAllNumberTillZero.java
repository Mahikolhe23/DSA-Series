package day3.conditional_loops_basic;

import java.util.Scanner;

public class P24_SumOfAllNumberTillZero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int n;
		do {
			System.out.println("Enter the number");
			n = in.nextInt();
			sum += n;
		} while (n != 0);
		System.out.println("Sum = " + sum);
		in.close();
	}
}
