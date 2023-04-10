package day3.conditional_loops_basic;

import java.util.Scanner;

public class P7_AreaOfEquilateralTriagle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of side");
		int side = in.nextInt();
		System.out.println("Area = " + area(side));
		in.close();
	}

	public static double area(int side) {
		return Math.sqrt(3) / 4 * side;
	}
}
