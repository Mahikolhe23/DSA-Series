package day3.conditional_loops_basic;

import java.util.Scanner;

public class P3_AreaOfRectangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int l = in.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int b = in.nextInt();
		System.out.println("Area of Rectangle is = " + rectangleArea(l, b));
		in.close();
	}

	public static double rectangleArea(int l, int b) {
		return l * b;
	}
}
