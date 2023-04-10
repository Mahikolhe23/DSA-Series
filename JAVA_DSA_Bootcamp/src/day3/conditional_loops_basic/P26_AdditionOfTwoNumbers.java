package day3.conditional_loops_basic;

import java.util.Scanner;

public class P26_AdditionOfTwoNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two number");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		System.out.println("Sum = " + (n1 + n2));
		in.close();
	}
}
