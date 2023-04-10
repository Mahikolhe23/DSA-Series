package day3.conditional_loops_basic;

import java.util.Scanner;

public class P12_PerimeterOfSquare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter side");
		int s = in.nextInt();
		System.out.println("Volume = " + perimeter(s));
		in.close();
	}

	public static int perimeter(int s) {
		return 4 * s;
	}
}
