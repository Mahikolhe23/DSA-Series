package day3.conditional_loops_basic;

import java.util.Scanner;

public class P19_CurvedSurfaceAreaOfCylinder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rad");
		int r = in.nextInt();
		System.out.println("Enter height");
		int h = in.nextInt();
		System.out.println("suface Area = " + sufaceArea(r, h));
		in.close();
	}

	private static double sufaceArea(int r, int h) {
		return 2 * Math.PI * r * h;
	}
}
