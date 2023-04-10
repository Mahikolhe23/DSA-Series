package day3.conditional_loops_basic;

import java.util.Scanner;

public class P4_AreaOfIsoscaleTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter height of triangle");
		int h = in.nextInt();
		System.out.println("Enter the base of triangle");
		int b = in.nextInt();
		System.out.println("Area = " + isoscaleArea(b, h));
		in.close();
	}

	public static double isoscaleArea(int b, int h) {
		return 0.5 * b * h;
	}
}
