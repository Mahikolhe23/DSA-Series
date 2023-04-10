package day3.conditional_loops_basic;

import java.util.Scanner;

public class P25_LargestNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int n;
		do {
			System.out.println("Enter the number");
			n = in.nextInt();
			if (max < n)
				max = n;
		} while (n != 0);
		System.out.println("Max = " + max);
		in.close();
	}
}
