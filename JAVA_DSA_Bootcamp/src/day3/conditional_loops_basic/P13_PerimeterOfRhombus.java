package day3.conditional_loops_basic;

import java.util.Scanner;

public class P13_PerimeterOfRhombus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter side");
		int s = in.nextInt();
		System.out.println("Enter base");
		int b = in.nextInt();
		System.out.println("Volume = " + perimeter(s, b));
		in.close();
	}

	private static int perimeter(int s, int b) {
		return b * s;
	}
}
