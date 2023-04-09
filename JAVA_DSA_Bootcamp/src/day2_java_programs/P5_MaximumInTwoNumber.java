package day2_java_programs;

import java.util.Scanner;

public class P5_MaximumInTwoNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the two Number ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		System.out.println("Maximum of two number is " + maximum(n1, n2));
		in.close();
	}

	public static int maximum(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else
			return n2;
	}
}
