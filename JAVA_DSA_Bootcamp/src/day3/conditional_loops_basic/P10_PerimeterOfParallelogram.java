package day3.conditional_loops_basic;

import java.util.Scanner;

public class P10_PerimeterOfParallelogram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter base and side");
		int b = in.nextInt();
		int s = in.nextInt();
		System.out.println("Perimeter = " + perimeter(b, s));
		in.close();
	}

	public static int perimeter(int b, int s) {
		return 2 * (b + s);
	}
}
