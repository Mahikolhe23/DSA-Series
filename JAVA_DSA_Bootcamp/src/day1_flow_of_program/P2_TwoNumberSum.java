package day1_flow_of_program;

import java.util.Scanner;

public class P2_TwoNumberSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two number");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		System.out.println("sum of two number = " + (num1 + num2));
		in.close();
	}
}
