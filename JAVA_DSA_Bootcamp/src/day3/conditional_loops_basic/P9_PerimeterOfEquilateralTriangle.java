package day3.conditional_loops_basic;

import java.util.Scanner;

public class P9_PerimeterOfEquilateralTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side");
		int side = in.nextInt();
		System.out.println("Perimeter = " + perimeter(side));
		in.close();
	}

	public static int perimeter(int side) {
		return side * 3;
	}
}
