package day3.conditional_loops_basic;

import java.util.Scanner;

public class P2_AreaOfTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the height");
		int h = in.nextInt();
		System.out.println("Enter the base");
		int b = in.nextInt();
		System.out.println(area(h, b));
		in.close();
	}

	public static double area(int h, int b) {
		return 0.5 * b * h;
	}
}
