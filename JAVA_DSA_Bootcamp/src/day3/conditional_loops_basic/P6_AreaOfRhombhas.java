package day3.conditional_loops_basic;

import java.util.Scanner;

public class P6_AreaOfRhombhas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length diagonal first");
		int d1 = in.nextInt();
		System.out.println("Enter the length diagonal second");
		int d2 = in.nextInt();
		System.out.println("Area = " + area(d1, d2));
		in.close();
	}

	public static double area(int d1, int d2) {
		return d1 * d2;
	}
}
