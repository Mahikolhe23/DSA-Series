package day3.conditional_loops_basic;

import java.util.Scanner;

public class P20_TotalSurfaceAreaOfCube {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter side");
		int s = in.nextInt();
		System.out.println("suface Area = " + sufaceArea(s));
		in.close();
	}

	private static double sufaceArea(int s) {
		return s * s * 6;
	}
}
